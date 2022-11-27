package com.iamkamrul.viewstatelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
        ViewStateLayoutConfig.networkErrorButtonDrawableRes = R.drawable.exaple_vsl_button_bg
        ViewStateLayoutConfig.networkErrorButtonTextColor = R.color.black
        ViewStateLayoutConfig.dataEmptyButtonBgDrawableRes = R.drawable.exaple_vsl_button_bg
        ViewStateLayoutConfig.dataEmptyButtonTextColor = R.color.black
        ViewStateLayoutConfig.networkErrorButtonStartDrawableRes = R.color.black


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_vsl,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.vslLoadingView -> binding.root.progressbarView(true)

            R.id.vslNetworkErrorView -> {
                binding.root.networkErrorView(
                    title = "Something went wrong",
                    message = "Check your network connection",
                    refreshCallback = {
                        Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
                    }
                )
            }

            R.id.vslDataEmptyErrorView -> {
                binding.root.dataEmptyView(
                    title = "Lorem Ipsum",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    refreshCallback = {
                        Toast.makeText(applicationContext, "data refresh Call", Toast.LENGTH_SHORT).show()
                    }
                )

            }

            R.id.vslLoadingViewLottie -> binding.root.progressBarLottieView(true)

            R.id.vslNetworkErrorViewLottie -> {
                binding.root.networkErrorLottieView(
                    title = "Something went wrong",
                    message = "Check your network connection",
                    refreshCallback = {
                        Toast.makeText(applicationContext, "refresh Call", Toast.LENGTH_SHORT).show()
                    }
                )
            }

            R.id.vslDataEmptyErrorViewLottie -> {
                binding.root .dataEmptyLottieView(
                    title = "Lorem Ipsum",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    refreshCallback = {
                        Toast.makeText(applicationContext, "data refresh Call", Toast.LENGTH_SHORT).show()
                    }
                )

            }
        }
        return super.onOptionsItemSelected(item)
    }
}