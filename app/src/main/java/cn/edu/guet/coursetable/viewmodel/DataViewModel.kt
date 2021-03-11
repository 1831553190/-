package cn.edu.guet.coursetable.viewmodel

import android.app.Application
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import cn.edu.guet.coursetable.adapter.Course2Adapter
import cn.edu.guet.coursetable.adapter.ExamAdapter
import cn.edu.guet.coursetable.adapter.Experimental2Adapter
import cn.edu.guet.coursetable.api.ApiInterface
import cn.edu.guet.coursetable.database.AppDatabase
import cn.edu.guet.coursetable.model.Account
import cn.edu.guet.coursetable.model.Course
import cn.edu.guet.coursetable.model.TermInfo
import cn.edu.guet.coursetable.util.DateUtil
import cn.edu.guet.coursetable.util.NetUtil
import com.google.gson.JsonElement
import com.zhuangfei.timetable.model.ScheduleEnable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

class DataViewModel(application: Application) : AndroidViewModel(application) {
    //验证码数据
    val bitmapData = MutableLiveData<Bitmap>()
    //网络接口
    val apiInterface = NetUtil.getRetrofit().create(ApiInterface::class.java)
    //课表数据
    val listSchedule = MutableLiveData<List<ScheduleEnable>>()
    //错误信息
    val errmsg = MutableLiveData<String>()
    //数据库
    val appdb: AppDatabase
    val TAG="DataViewModel"

    val account = MutableLiveData<Account>()

    init {

        //初始化数据库
        appdb = Room.databaseBuilder(
            application.applicationContext, AppDatabase::class.java, "student"
        ).fallbackToDestructiveMigration().build()

    }


    fun loginObs(): MutableLiveData<List<ScheduleEnable>> {
        return listSchedule
    }

    fun loginErrMsg(): MutableLiveData<String> {
        return errmsg;
    }


    /**
     * login：登录操作
     *  先登录，登录成功后，同步获取学期信息以及个人信息
     *  获取成功后再通过学期信息获取当前学期的课表，不获取所有学期的信息
     *
     *  flow ： 数据流，和RxJava类似的操作
     */
    fun login(username: String, password: String, ckcode: String) {
        viewModelScope.launch {
            val body =
                HashMap<String, String>()
            body["us"] = username
            body["pwd"] = password
            body["ck"] = ckcode

            flow<JsonElement> {
//                登录判断
                try {
                    emit(apiInterface.login(body))
                } catch (e: Exception) {
                    errmsg.postValue("登录失败${e.message}")
                    e.printStackTrace()
                    Log.d("TAG", "login:error ")
                    //抛出异常中断流的下一步操作
                    throw Exception(":网络可能出现故障")
                }
            }.catch {
                Log.d("TAG", "login:error " + it.message)
                it.printStackTrace()
            }.flatMapConcat {
                if (it.getAsJsonObject().get("success").getAsBoolean()) {
                    val userDao=appdb.userDao()
                    val a=System.currentTimeMillis()

                    //异步并发删除数据库的信息
                    async { userDao.deleteAllTermInfo() }.await()
                    async { userDao.deleteAllAccount() }.await()
                    async { userDao.deleteAllCourse() }.await()
                    async { userDao.deleteAllExam() }.await()
                    async { userDao.deleteAllExp() }.await()

                    Log.d("TAG", "login: success ${System.currentTimeMillis()-a} ms")
                } else {
                    Log.d("TAG", "login: failed")
                    errmsg.postValue("登录失败，请检查用户名及密码是否正确")
                    throw Exception(":请检查用户名及密码")
                }
                return@flatMapConcat flow<TermInfo> {

                    val termInfobody = HashMap<String, String>()
                    termInfobody["_dc"] = System.currentTimeMillis().toString()
                    termInfobody["page"] = "1"
                    termInfobody["start"] = "0"
                    termInfobody["limit"] = "25"

                    //异步并发获取学期和个人信息
                    val studentInfo = viewModelScope.async {
                        val a = apiInterface.getPersonInfo()
                        return@async a.data
                    }
                    val termInfo = viewModelScope.async {
                        val terms = apiInterface.getTermInfo(termInfobody)
                        val localnow = LocalDate.now()
                        val timeNow = Calendar.getInstance().time.time
                        val termInfo1 = terms.data?.filter {
                            val edate = Date(it.enddate)
                            val sdate = Date(it.startdate)
                            return@filter edate.time >= timeNow && sdate.time < timeNow
                        }?.first() ?: TermInfo()
                        return@async termInfo1
                    }
                    studentInfo.await().also {
                        if (it != null) {
                            appdb.userDao().insert(it)
                            account.postValue(it)
                        }
                    }
                    termInfo.await().also {
                        emit(it)
                        val date=Date(it.startdate)
                        val localdate= LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate()
                        val wk= DateUtil.getCurrentWeek(localdate).toInt()
                        EventBus.getDefault().post(wk.toString())
                        appdb.userDao().insert(it)
                    }
                }
            }.catch {
                errmsg.postValue("获取学期信息失败")
                Log.d("TAG", "terminfo:error " + it.message)
                it.printStackTrace()
            }.flatMapConcat {
                return@flatMapConcat flow<List<ScheduleEnable>> {
                    val body2 = HashMap<String, String>()
                    body2["_dc"] = System.currentTimeMillis().toString()
                    body2["term"] = it.term
                    body2["page"] = "1"
                    body2["start"] = "0"
                    val scheduleEnables = ArrayList<ScheduleEnable>()
                    //获取课程信息并添加到列表里
                    viewModelScope.async {
                        val a = apiInterface.getCourseTable(body2)
                        a.data?.forEach {
                            scheduleEnables.add(Course2Adapter(it))
                        }
                        return@async a.data
                    }.await().also {
                        appdb.userDao().insertCourse(it!!)
                    }
                    viewModelScope.async {
                        val a = apiInterface.getLabTable(body2)
                        a.data?.forEach {
                            scheduleEnables.add(Experimental2Adapter(it))
                        }
                        return@async a.data
                    }.await().also {
                        appdb.userDao().insertExp(it!!)
                    }
                    viewModelScope.async {
                        val a = apiInterface.getExams(body2)
                        a.data?.forEach {
                            scheduleEnables.add(ExamAdapter(it))
                        }
                        return@async a.data
                    }.await().also {
                        appdb.userDao().insertExam(it!!)
                    }
                    emit(scheduleEnables)
                }
            }.catch {
                errmsg.postValue("获取课程信息出错")
                Log.d("TAG", "ScheduleEnable:error " + it.message)
                it.printStackTrace()
            }.collect {
                Log.d("TAG", "ScheduleEnable:size:${it.size} ")
                listSchedule.postValue(it)
            }
        }
    }

    fun verifyCode(): MutableLiveData<Bitmap> {
        return bitmapData
    }


    //加载验证码
    fun loadVerifyCode() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val resp = NetUtil.getRetrofit().create(ApiInterface::class.java).getVerifyCode()
                val bytes = resp.bytes()
                //解析数据成图片
                val bitmap=BitmapFactory.decodeByteArray(bytes,0,resp.contentLength().toInt())
                bitmapData.postValue(bitmap);
            } catch (e: Exception) {
                e.printStackTrace()
                Log.d("TAG", "loadVerifyCode:error ")
                errmsg.postValue("网络错误")
            }

        }
    }


}