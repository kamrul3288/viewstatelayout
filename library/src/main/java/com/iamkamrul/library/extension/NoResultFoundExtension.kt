package com.iamkamrul.library.extension

import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.library.R
import com.iamkamrul.library.ViewStateLayoutConfig
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding

fun ViewStateConstraintLayoutBinding.showSimpleDataEmptyView(
    emptyImage:Int = R.drawable.ic_no_result,
    message:String,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    refreshCallback:()->Unit
){
    // hide all error layout
    dataEmptyConfig()

    // show no result simple layout
    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = true
    // hide no result lottie layout
    incLottieDataEmptyLayout.lottieDataEmptyLayout.isVisible = false
    // set refresh button visibility
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.isVisible = refreshButtonVisibility

    incSimpleDataEmptyLayout.dataEmptyIv.setImageResource(emptyImage)
    incSimpleDataEmptyLayout.dataEmptyMessageTv.text = message
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setBackgroundResource(buttonDrawable)
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.text = buttonText
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setOnClickListener {
        refreshCallback.invoke()
    }
}

fun ViewStateConstraintLayoutBinding.showLottieDataEmptyView(
    lottieRes:Int,
    message:String,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    refreshCallback:()->Unit
){

    // hide all error layout
    dataEmptyConfig()

    // show no result lottie layout
    incLottieDataEmptyLayout.lottieDataEmptyLayout.isVisible = true
    // hide no result simple layout
    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = false
    // set refresh button visibility
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.isVisible = refreshButtonVisibility

    incLottieDataEmptyLayout.dataEmptyIv.setAnimation(lottieRes)
    incLottieDataEmptyLayout.dataEmptyIv.playAnimation()
    incLottieDataEmptyLayout.dataEmptyMessageTv.text = message
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setBackgroundResource(buttonDrawable)
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.text = buttonText
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setOnClickListener {
        if (ViewStateLayoutConfig.refreshButtonViewSateManageFlag){
            hideDataEmptyLayout()
        }
        refreshCallback.invoke()
    }
}

private fun ViewStateConstraintLayoutBinding.dataEmptyConfig(){
    hideProgressLayout()
    hideNetworkErrorLayout()
}


fun ViewStateConstraintLayoutBinding.hideDataEmptyLayout(){
    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = false
    incLottieDataEmptyLayout.lottieDataEmptyLayout.isVisible = false
    incLottieDataEmptyLayout.dataEmptyIv.cancelAnimation()
}