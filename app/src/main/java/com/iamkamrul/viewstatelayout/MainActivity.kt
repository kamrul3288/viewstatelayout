package com.iamkamrul.viewstatelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.iamkamrul.library.constant.ViewStateConfig
import com.iamkamrul.viewstatelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val  binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}