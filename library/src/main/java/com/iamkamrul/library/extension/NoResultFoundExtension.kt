package com.iamkamrul.library.extension

import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.library.R
import com.iamkamrul.library.constant.ViewStateConfig
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding

fun ViewStateConstraintLayoutBinding.showSimpleDataEmptyView(
    emptyImage:Int = R.drawable.ic_no_result,
    message:String,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    refreshCallback:()->Unit
){
    // hide all error layout
    dataEmptyConfig()

    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = true
    incLottieDataEmptyLayout.lottieDataEmptyLayout.isVisible = false
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
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    refreshCallback:()->Unit
){

    // hide all error layout
    dataEmptyConfig()

    incLottieDataEmptyLayout.lottieDataEmptyLayout.isVisible = true
    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = false
    incLottieDataEmptyLayout.dataEmptyIv.setAnimation(lottieRes)
    incLottieDataEmptyLayout.dataEmptyIv.playAnimation()
    incLottieDataEmptyLayout.dataEmptyMessageTv.text = message
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setBackgroundResource(buttonDrawable)
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.text = buttonText
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setOnClickListener {
        if (ViewStateConfig.refreshButtonViewSateManageFlag){
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