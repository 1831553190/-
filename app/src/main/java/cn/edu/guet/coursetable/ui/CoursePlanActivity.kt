package cn.edu.guet.coursetable.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import cn.edu.guet.coursetable.databinding.ActivityCoursePlanBinding
import cn.edu.guet.coursetable.databinding.ItemCourseplanDetailBinding
import cn.edu.guet.coursetable.model.CoursePlan
import cn.edu.guet.coursetable.viewmodel.DataViewModel

class CoursePlanActivity : BaseActivity() {


    lateinit var mView: ActivityCoursePlanBinding
    val courseList = ArrayList<CoursePlan>()

    lateinit var dataViewMdel:DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mView = ActivityCoursePlanBinding.inflate(layoutInflater)
        setContentView(mView.root)
        setSupportActionBar(mView.mainToolbar)
        supportActionBar?.setTitle("选课")
        mView.coursePlanRecyclerview.adapter = ListAdapter(courseList)
        initObserver()
    }
    private fun initObserver() {
        dataViewMdel=ViewModelProvider(this).get(DataViewModel::class.java)
        dataViewMdel.coursePlan.observe(this, Observer {
            courseList.addAll(it)
            mView.coursePlanRecyclerview.adapter?.notifyDataSetChanged()
        })
        dataViewMdel.loadCoursePlan()
    }
}

class ListAdapter(list: ArrayList<CoursePlan>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var mAdapterView: ItemCourseplanDetailBinding
    val coursePlanList = list;

    override fun getItemCount(): Int {
        return coursePlanList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        mAdapterView.cName.text="${coursePlanList[position].cname}"
//        mAdapterView.teName.text="教师：${coursePlanList[position].name}"
        mAdapterView.alselect.text="已选：${coursePlanList[position].sctcnt}"
        mAdapterView.maxStu.text="容量：${coursePlanList[position].maxstu}"
        mAdapterView.courseVal.text="学分：${coursePlanList[position].xf}"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        mAdapterView= ItemCourseplanDetailBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return object : RecyclerView.ViewHolder(mAdapterView.root) {

        }
    }

}