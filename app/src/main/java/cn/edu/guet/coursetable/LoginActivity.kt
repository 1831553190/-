package cn.edu.guet.coursetable

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.app.ProgressDialog
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.util.Log
import android.view.View
import android.view.ViewAnimationUtils
import android.view.animation.DecelerateInterpolator
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import cn.edu.guet.coursetable.databinding.LayoutLoginBinding
import cn.edu.guet.coursetable.ui.BaseActivity
import cn.edu.guet.coursetable.viewmodel.DataViewModel
import com.bumptech.glide.Glide
import com.zhuangfei.timetable.model.ScheduleEnable
import org.greenrobot.eventbus.EventBus

class LoginActivity : BaseActivity() {


    lateinit var mView: LayoutLoginBinding
    lateinit var preference: SharedPreferences
//    初始化ViewModel
    val dataViewModel: DataViewModel by viewModels()
    //进度视图
    lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mView = LayoutLoginBinding.inflate(layoutInflater)
        setContentView(mView.root)
        //初始化SharePreference
        preference = PreferenceManager.getDefaultSharedPreferences(this)
        //判断获取记住密码的复选框时候勾选
        val isCheck = preference.getBoolean("isrem", false)
        mView.remPassword2.isChecked = isCheck
        initObserver()
        if (isCheck) {
            val user = preference.getString("username", "")
            val pass = preference.getString("password", "")
            mView.editUser2.editText?.setText(user)
            mView.editPass2.editText?.setText(pass)
        }
        progressDialog = ProgressDialog(this)
            .also {
                it.setTitle("登陆中")
                it.setMessage("请稍后")
            }

        mView.layoutView.alpha = 0F
        mView.editUser2.setEndIconOnClickListener {
            mView.editUser2.editText?.setText("")
            mView.editPass2.editText?.setText("")
        }
        mView.btnLogin2.setOnClickListener {
            val user = mView.editUser2.editText?.text.toString()
            val pass = mView.editPass2.editText?.text.toString()
            val code = mView.editCode.editText?.text.toString()
            progressDialog.show()
            dataViewModel.login(user, pass, code)
        }
        mView.imgCode.setOnClickListener {
            dataViewModel.loadVerifyCode()
        }

    }

    /**
     *  开始设置ViewModel的观察事件
     */
    fun initObserver() {

        //验证码
        dataViewModel.verifyCode().observe(this, Observer {
            Glide.with(this)
                .load(it)
                .into(mView.imgCode)
        })
        //登录成功
        dataViewModel.loginObs().observe(this, Observer {
            loginSuccess(it)
        })

        //登录失败返回的消息
        dataViewModel.loginErrMsg().observe(this, Observer {
            Toast.makeText(this@LoginActivity, it, Toast.LENGTH_SHORT).show()
            if (progressDialog.isShowing) {
                progressDialog.dismiss()
            }
        })

        //开始获取验证码
        dataViewModel.loadVerifyCode()
    }


    /**
     * 登录成功后的操作
     * list ：返回的课程信息
     */
    fun loginSuccess(list: List<ScheduleEnable>) {
        //给Fragment发送课程列表信息，一遍更新课表
        EventBus.getDefault().post(list)
        if (mView.remPassword2.isChecked()) {
            preference.edit()
                .putString("username", mView.editUser2.editText?.text.toString())
                .putString("password", mView.editPass2.editText?.text.toString())
                .putBoolean("isrem", mView.remPassword2.isChecked())
                .apply()
        } else {
            preference.edit()
                .remove("username")
                .remove("password")
                .apply()
        }
        Toast.makeText(this@LoginActivity, "登陆成功!", Toast.LENGTH_SHORT).show()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val xc: Int = (mView.btnLogin2.getLeft() + mView.btnLogin2.getRight()) / 2
            val yc: Int = (mView.btnLogin2.getTop() + mView.btnLogin2.getBottom()) / 2
            val r = Math.sqrt(xc * xc + yc * yc.toDouble())
            mView.layoutView.setVisibility(View.VISIBLE)
            mView.layoutView.alpha = 1F
            var animator = ViewAnimationUtils.createCircularReveal(
                mView.layoutView,
                xc,
                yc,
                0f,
                r.toFloat() + 50
            )
            animator.setDuration(500)
            animator.setInterpolator(DecelerateInterpolator())
            animator.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationStart(animation: Animator) {
                    super.onAnimationStart(animation)

                    //延时启动
                    Handler().postDelayed({
                        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                        finish()
                    }, 300)
                }
            })
            animator.start()
        } else {
            finish()
        }
        progressDialog.dismiss()
        Log.d("TAG", "EventBus: post")
    }

}