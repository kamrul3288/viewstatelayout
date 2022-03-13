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
        binding.progressBtn.elevation = 0f

        binding.progressBtn.setOnClickListener {
            binding.viewState.setSimpleProgressBarStatusLayout(true)
        }

        binding.networkError.setOnClickListener {
            binding.viewState.showSimpleNetworkErrorLayout {
                Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

        binding.dataEmptyBtn.setOnClickListener {
            binding.viewState.showSimpleDataEmptyLayout {
                Toast.makeText(applicationContext, "data refresh Call", Toast.LENGTH_SHORT).show()
            }

        }



        binding.lottieProgressBtn.setOnClickListener {
            binding.viewState.setLottieProgressBarStatusLayout(true)
        }

        binding.lottieNetworkError.setOnClickListener {
            binding.viewState.showLottieNetworkErrorLayout {
                Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

        binding.lottieDataEmptyBtn.setOnClickListener {
            binding.viewState.showLottieDataEmptyLayout {
                Toast.makeText(applicationContext, "data refresh Call", Toast.LENGTH_SHORT).show()
            }

        }

    }
}