package com.iamkamrul.viewstatelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            binding.viewState.setSimpleProgressBarStatus(true)
            binding.viewState.hideSimpleNetworkError()
        }

        binding.networkError.setOnClickListener {
            binding.viewState.setSimpleProgressBarStatus(false)
            binding.viewState.showSimpleNetworkError {
                Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

    }
}