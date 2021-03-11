package cn.edu.guet.coursetable

import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Observer
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import cn.edu.guet.coursetable.databinding.ActivityMainBinding
import cn.edu.guet.coursetable.ui.BaseActivity
import cn.edu.guet.coursetable.ui.FragmentCourse
import cn.edu.guet.coursetable.ui.FragmentUser
import cn.edu.guet.coursetable.viewmodel.DBViewModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class MainActivity : BaseActivity() {


    //主视图
    lateinit var mView: ActivityMainBinding
    lateinit var pref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mView=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mView.root)
        //注册EventBus
        EventBus.getDefault().register(this)
        setSupportActionBar(mView.mainToolbar)
        pref = PreferenceManager.getDefaultSharedPreferences(this)


        //设置ViewPager2的适配器
        mView.viewpager.adapter=object :FragmentStateAdapter(this){

            override fun createFragment(position: Int): Fragment {
                return if (position==0) FragmentCourse.getInstance() else FragmentUser.getInstance()
            }

            override fun getItemCount(): Int {
                return 2
            }
        }
        supportActionBar?.setTitle(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")))
        //设置副标题
        mView.mainToolbar.setSubtitle("桂电课程表")

        //设置导航监听
        mView.bottomMain.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_course->
                    mView.viewpager.setCurrentItem(0)
                R.id.menu_more->
                    mView.viewpager.setCurrentItem(1)
            }
            return@setOnNavigationItemSelectedListener true;
        }


        //添加ViewPager2的选择事件，使Spinner在切换Fragment的时候能自动显示消失
        mView.viewpager.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                mView.bottomMain.setSelectedItemId(
                    mView.bottomMain.getMenu().getItem(position).getItemId()
                )
                mView.toolbarSpinner.setVisibility(if (position == 1) View.INVISIBLE else View.VISIBLE)
            }
        })


        //给Spinner设置简单的适配器
        mView.toolbarSpinner.setAdapter(
            ArrayAdapter(
                this,
                R.layout.spinner_item,
                R.id.spinner_week,
                resources.getStringArray(R.array.weeklist)
            )
        )


        //Spinner点击后切换周数
        mView.toolbarSpinner.setOnItemSelectedListener(object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View,
                position: Int,
                id: Long
            ) {
                EventBus.getDefault().post((position+1).toString())
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        })
    }


    /**
     * EventBus获取广播周数并获取后，设置周数
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun updateSpinnerText(week:String){
        mView.toolbarSpinner.setSelection(week.toInt()-1)
        supportActionBar?.setSubtitle("当前第${week}周")
        Log.d("TAG", "onDestroy: $week")

    }


    /**
     * 活动注销后要解除EventBus的注册
     */
    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }
}