package com.iamkamrul.viewstatelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.iamkamrul.vsl.ViewStateLayoutConfig
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


        binding.progressBtn.elevation = 0f

        binding.progressBtn.setOnClickListener {
            binding.root.setSimpleProgressBarStatusLayout(true)
        }

        binding.networkError.setOnClickListener {
            binding.root.showSimpleNetworkErrorLayout(
                title = "Something went wrong",
                message = "Check your network connection"
            ) {
                Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

        binding.dataEmptyBtn.setOnClickListener {
            binding.root.showSimpleDataEmptyLayout(
                title = "Lorem Ipsum",
                message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            ) {
                Toast.makeText(applicationContext, "data refresh Call", Toast.LENGTH_SHORT).show()
            }

        }

        binding.lottieProgressBtn.setOnClickListener {
            binding.root.setLottieProgressBarStatusLayout(true)
        }

        binding.lottieNetworkError.setOnClickListener {
            binding.root.showLottieNetworkErrorLayout(
                title = "Something went wrong",
                message = "Check your network connection"
            ) {
                Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

        binding.lottieDataEmptyBtn.setOnClickListener {
            binding.root .showLottieDataEmptyLayout(
                title = "Lorem Ipsum",
                message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            ) {
                Toast.makeText(applicationContext, "data refresh Call", Toast.LENGTH_SHORT).show()
            }

        }
    }
}