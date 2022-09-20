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
        ViewStateLayoutConfig.networkErrorButtonBg = R.drawable.button_bg
        ViewStateLayoutConfig.networkButtonTextColor = R.color.black
        ViewStateLayoutConfig.dataEmptyButtonBg = R.drawable.button_bg
        ViewStateLayoutConfig.dataEmptyButtonTextColor = R.color.black
    }
}