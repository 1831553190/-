package cn.edu.guet.coursetable.ui

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val flagTranslucentStatus =
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
            val flagTranslucentNavigation =
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val window = window
                val attributes = window.attributes
                attributes.flags = attributes.flags or flagTranslucentNavigation
                window.attributes = attributes
                getWindow().statusBarColor = Color.TRANSPARENT
            } else {
                val window = window
                val attributes = window.attributes
                attributes.flags =
                    attributes.flags or (flagTranslucentStatus or flagTranslucentNavigation)
                window.attributes = attributes
            }
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }

    }
}