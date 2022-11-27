package com.iamkamrul.viewstatelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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


        binding.progressBtn.elevation = 0f

        binding.progressBtn.setOnClickListener {
            binding.viewState.setSimpleProgressBarStatusLayout(true)
        }

        binding.networkError.setOnClickListener {
            binding.viewState.showSimpleNetworkErrorLayout(
                title = "Something went wrong",
                message = "Check your network connection"
            ) {
                Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

        binding.dataEmptyBtn.setOnClickListener {
            binding.viewState.showSimpleDataEmptyLayout(
                title = "Lorem Ipsum",
                message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            ) {
                Toast.makeText(applicationContext, "data refresh Call", Toast.LENGTH_SHORT).show()
            }

        }

        binding.lottieProgressBtn.setOnClickListener {
            binding.viewState.setLottieProgressBarStatusLayout(true)
        }

        binding.lottieNetworkError.setOnClickListener {
            binding.viewState.showLottieNetworkErrorLayout(
                title = "Something went wrong",
                message = "Check your network connection"
            ) {
                Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

        binding.lottieDataEmptyBtn.setOnClickListener {
            binding.viewState.showLottieDataEmptyLayout(
                title = "Lorem Ipsum",
                message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            ) {
                Toast.makeText(applicationContext, "data refresh Call", Toast.LENGTH_SHORT).show()
            }

        }
    }
}