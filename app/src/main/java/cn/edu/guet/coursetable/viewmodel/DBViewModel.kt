package cn.edu.guet.coursetable.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import cn.edu.guet.coursetable.adapter.Course2Adapter
import cn.edu.guet.coursetable.adapter.ExamAdapter
import cn.edu.guet.coursetable.adapter.Experimental2Adapter
import cn.edu.guet.coursetable.database.AppDatabase
import cn.edu.guet.coursetable.model.Account
import cn.edu.guet.coursetable.model.TermInfo
import cn.edu.guet.coursetable.util.DateUtil
import com.zhuangfei.timetable.model.ScheduleEnable
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

/**
 * DBViewModel ：主要是从数据库中查询个人信息并返回
 */
class DBViewModel(application: Application) : AndroidViewModel(application) {

    val TAG="DBViewModel"

    //课程列表
    private val courses = MutableLiveData<List<ScheduleEnable>>()
    //当前周数
    private val curWek = MutableLiveData<Int>()
    val account = MutableLiveData<Account>()
    //数据库
    private val appdb: AppDatabase

    init {
        //初始化
        appdb = Room.databaseBuilder(
            application.applicationContext, AppDatabase::class.java, "student"
        )
            .fallbackToDestructiveMigration().build()
    }


    //
    fun courseTableObserver(): MutableLiveData<List<ScheduleEnable>> {
        return courses;
    }

    fun currentWeekObserver(): MutableLiveData<Int> {
        return curWek;
    }


    /**
     * 从数据库加载课程信息
     */
    fun loadCourseTables() {

        //协程获取课表信息
        viewModelScope.launch {
            val usrDao = appdb.userDao()
            val scheduleEnables = ArrayList<ScheduleEnable>()

            //几个异步请求同时查询，大概可以减少查询时间
            async {
                val termInfo:TermInfo?=appdb.userDao().getTermInfo()
                val localdate:LocalDate
                if (termInfo==null){
                    localdate= LocalDate.now()
                }else{
                    val date=Date(termInfo.startdate)
                    localdate=LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate()
                }
                val wk=DateUtil.getCurrentWeek(localdate).toInt()
                //更新当前的周数
                curWek.postValue(wk)
            }.await()

            viewModelScope.async {
                return@async usrDao.getCourses()
            }.await().forEach {
                scheduleEnables.add(Course2Adapter(it))
            }
            viewModelScope.async {
                return@async usrDao.getExps()
            }.await().forEach {
                scheduleEnables.add(Experimental2Adapter(it))
            }
            viewModelScope.async {
                return@async usrDao.getExam()
            }.await().forEach {
                scheduleEnables.add(ExamAdapter(it))
            }
            //发送课表数据
            courses.postValue(scheduleEnables)

            viewModelScope.async {
                return@async usrDao.getAccountInfo()
            }.await().also {
                if (it!=null){
                    account.postValue(it)
                }
            }


        }
    }


}