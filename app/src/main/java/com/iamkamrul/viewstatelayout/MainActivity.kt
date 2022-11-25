package com.iamkamrul.viewstatelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iamkamrul.library.ViewStateLayoutConfig
import com.iamkamrul.viewstatelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val  binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        //set global configuration
        ViewStateLayoutConfig.progressBarColor = R.color.purple_700
        ViewStateLayoutConfig.networkErrorButtonDrawableRes = R.drawable.button_bg
        ViewStateLayoutConfig.networkErrorButtonTextColor = R.color.black
        ViewStateLayoutConfig.dataEmptyButtonBgDrawableRes = R.drawable.button_bg
        ViewStateLayoutConfig.dataEmptyButtonTextColor = R.color.black
        ViewStateLayoutConfig.networkErrorButtonStartDrawableRes = R.color.black
    }
}