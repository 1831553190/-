package cn.edu.guet.coursetable.ui

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import cn.edu.guet.coursetable.LoginActivity
import cn.edu.guet.coursetable.R
import cn.edu.guet.coursetable.databinding.DialogCourseDetailBinding
import cn.edu.guet.coursetable.databinding.FragmentCourseBinding
import cn.edu.guet.coursetable.databinding.ItemCourseDetailBinding
import cn.edu.guet.coursetable.util.DateUtil
import cn.edu.guet.coursetable.viewmodel.DBViewModel
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zhuangfei.timetable.TimetableView
import com.zhuangfei.timetable.listener.ISchedule
import com.zhuangfei.timetable.model.Schedule
import com.zhuangfei.timetable.model.ScheduleEnable
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.text.MessageFormat
import java.util.*
import kotlin.collections.ArrayList

class FragmentCourse : Fragment() {


    /**
     * 生成单例Fragment
     */
    companion object {
        var fragment: Fragment? = null
        fun getInstance(): Fragment {
            return fragment ?: synchronized(this) {
                val ins = FragmentCourse()
                fragment = ins
                ins
            }
        }
    }

    lateinit var timeTable: TimetableView
    lateinit var dbViewModel: DBViewModel
    lateinit var mView: FragmentCourseBinding
    lateinit var bottomView: DialogCourseDetailBinding
    val courseList=ArrayList<Schedule>()
    lateinit var listAdapter: ListAdapter
    var curWeek=1;
    lateinit var bottomSheetDialog:BottomSheetDialog
    lateinit var mDialogBehavior: BottomSheetBehavior<View>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = FragmentCourseBinding.inflate(inflater,container,false)
        val f = FrameLayout(requireContext())
        bottomView = DialogCourseDetailBinding.inflate(layoutInflater,f,false)
        bottomSheetDialog = BottomSheetDialog(requireContext(), R.style.BottomSheetDialog)

        bottomSheetDialog.setContentView(bottomView.root)
        bottomSheetDialog.dismissWithAnimation=false
        mDialogBehavior = BottomSheetBehavior.from(bottomView.root.parent as View)
        EventBus.getDefault().register(this)
        dbViewModel = ViewModelProvider(requireActivity()).get(DBViewModel::class.java)
        DBObserver()
//        initBottomSheet()
        Log.d("TAG", "loadCourseTables: load")
        dbViewModel.loadCourseTables()
        return mView.root
    }

    fun DBObserver(){
        dbViewModel.currentWeekObserver().observe(viewLifecycleOwner, Observer {
            curWeek=it
            //EventBus不能传输基本数据类型，如Int等，因此只能转换成String再发送
            EventBus.getDefault().post(it.toString())
//            timeTable.curWeek(it).updateDateView()
        })
        dbViewModel.courseTableObserver().observe(viewLifecycleOwner, Observer {
            //判断课表是否为空
            if (it.isEmpty()) {
                val anim = mView.progressLoad.animate().alpha(0F)
                anim.setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator?) {
                        mView.progressLoad.visibility = View.GONE
                    }
                })
                mView.btnTLoging.visibility = View.VISIBLE
                mView.btnTLoging.animate().alpha(1F).start()
                mView.textHint.visibility = View.VISIBLE
                mView.textHint.animate().alpha(1F).start()
            } else {
                timeTable.source(it).updateView()
                val anim = mView.viewLoad.animate().alpha(0F)
                anim.setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator?) {
                        super.onAnimationEnd(animation)
                        mView.viewLoad.visibility = View.GONE
                    }
                })
            }

        })

    }



    fun initBottomSheet(){
        listAdapter= ListAdapter()
        bottomView.dialogDetialRecyclerView.adapter=listAdapter
        mView.idTimetableView.callback (object :ISchedule.OnItemClickListener{
            override fun onItemClick(v: View?, scheduleList: MutableList<Schedule>?) {

                Log.d("TAG", ":click ")
                Collections.sort(scheduleList, object : Comparator<Schedule?> {
                    override fun compare(o1: Schedule?, o2: Schedule?): Int {
                        if (o2!=null){
                            var beginWeek = o2.extras["beginWeek"] as Int?
                            var endWeek = o2.extras["endWeek"] as Int?
                            if (o2.name.contains("实验")) {
                                endWeek = o2.extras["week"] as Int?
                                beginWeek = endWeek
                            }
                            return if (beginWeek != null && endWeek != null && curWeek >= beginWeek && curWeek <= endWeek) {
                                1
                            } else {
                                -1
                            }
                        }
                        return -1
                    }
                })
                listAdapter.refreshList(scheduleList)
                listAdapter.setWeek(curWeek)
                listAdapter.notifyDataSetChanged()
                bottomSheetDialog.show()
                Log.d("TAG", ":click ")

            }

        })
    }




    class ListAdapter() : RecyclerView.Adapter<Holder>() {

        lateinit var list:List<Schedule>
        lateinit var itemCourse:ItemCourseDetailBinding
        var curWeek=1


        fun setWeek(currentWeek: Int) {
            curWeek = currentWeek
        }


        fun refreshList(ls: List<Schedule>?) {
            if (ls != null) {
                this.list = ls
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            itemCourse= ItemCourseDetailBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return Holder(itemCourse.root)
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            val courseNumber = list.get(position).getExtras().get("courseNumber")
            var beginWeek = list.get(position).getExtras().get("beginWeek") as Int
            var endWeek = list.get(position).getExtras().get("endWeek") as Int
            val dayOfWeek: String = DateUtil.getDay(list.get(position).getDay())
            itemCourse.dialogCourseName.setText(String.format("课程: %s", list.get(position).getName()))
            if (list.get(position).getName().contains("实验")) {
                itemCourse.dialogCourseNumber.setText(String.format("实验名称:%s", list.get(position).getExtras().get("name")))
                endWeek = list.get(position).getExtras().get("week") as Int
                beginWeek = endWeek
            } else {
                if (courseNumber == null || courseNumber == "") {
                    itemCourse.dialogCourseNumber.setText("课号:")
                } else {
                    itemCourse.dialogCourseNumber.setText(MessageFormat.format("课号: {0}", courseNumber))
                }
                itemCourse.dialogCourseType.setText(
                    MessageFormat.format(
                        "性质:{0}",
                        list.get(position).getExtras().get("courseType")
                    )
                )
            }
            itemCourse.dialogClassroom.setText(String.format("教室: %s", list.get(position).getRoom()))
            itemCourse.dialogCourseTime.setText(String.format("日期: %s 第%d大节", dayOfWeek, list.get(position).getStart() / 2 + 1))
            if (beginWeek != null && endWeek != null && beginWeek.toInt() == endWeek) {
                itemCourse.dialogCourseWeek.setText(String.format("周次: 第%d周", endWeek))
            } else {
                itemCourse.dialogCourseWeek.setText(String.format("周次: %d-%d周", beginWeek, endWeek))
            }

            val res=itemCourse.root.resources
            if (beginWeek != null && endWeek != null && curWeek >= beginWeek && curWeek <= endWeek) {
                itemCourse.itemCBg.setBackground(res.getDrawable(R.drawable.active_bg))
            } else {
                itemCourse.itemCBg.setBackground(res.getDrawable(R.drawable.active_bg_none))
            }
            itemCourse.dialogCourseTeacher.setText(String.format("教师: %s", list.get(position).getTeacher()))
        }




    }

    class Holder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        timeTable = mView.idTimetableView
        mView.btnTLoging.setOnClickListener { startActivity(Intent(context, LoginActivity::class.java)) }
        timeTable.callback((ISchedule.OnItemClickListener() { _: View, mutableList: MutableList<Schedule> -> }))
        timeTable.isShowNotCurWeek(true)
        initBottomSheet()
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    fun updateCourseTable(list: List<ScheduleEnable>) {
        mView.idTimetableView.source(list).updateView()
        mView.viewLoad.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }



    //通过周数更新课表
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun updateSpinnerText(week:String){
        timeTable.curWeek(week.toInt()).updateView()
        timeTable.onDateBuildListener().onUpdateDate(week.toInt(),week.toInt())
    }
}