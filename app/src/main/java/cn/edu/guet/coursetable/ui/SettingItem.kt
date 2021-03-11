package cn.edu.guet.coursetable.ui

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import cn.edu.guet.coursetable.R
import cn.edu.guet.coursetable.databinding.LayoutSettingItemBinding


class SettingItem :FrameLayout{

    private var title:String?
    var summary:String?=null
    var resId:Int = 0
    lateinit var binding:LayoutSettingItemBinding

    constructor(context: Context, title: String) : super(context){
        init(context)
        this.title = title
        init(context)
    }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs){
        init(context)
        val typedArray: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.st_Setting)
        title = typedArray.getString(R.styleable.st_Setting_st_titleText)
        summary = typedArray.getString(R.styleable.st_Setting_st_subTitleText)
        resId = typedArray.getResourceId(R.styleable.st_Setting_st_icon, 0)
        init(context)
        typedArray.recycle()
    }

    fun init(context: Context){
        binding=LayoutSettingItemBinding.inflate(LayoutInflater.from(context),this,true)
        binding.imgIcon.setImageResource(resId)
        if (summary==null|| summary!!.isEmpty()){
            binding.textsubTitle.setVisibility(GONE);
        }else {
            binding.textsubTitle.text=summary
        }
//        if(title==null){
//            binding.textTitle.text="无标题"
//        }else{
            binding.textTitle.text=title
//        }

    }


    fun setTitle(title: String?) {
        this.title = title!!
        binding.textTitle.setText(title)
    }

    fun setSum(summary: String?) {
        this.summary = summary
        binding.textsubTitle.setText(title)
    }

    fun setIcon(resId: Int) {
        this.resId = resId
        binding.imgIcon.setImageResource(resId)
    }

    fun getTitle(): String? {
        return title
    }

    fun getSum(): String? {
        return summary
    }

}