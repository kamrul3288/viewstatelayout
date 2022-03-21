package com.iamkamrul.library.extension

import androidx.annotation.RawRes
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.library.constant.ViewStateConfig.refreshButtonViewSateManageFlag
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding

//--------show simple network error layout------------
fun ViewStateConstraintLayoutBinding.showSimpleNetworkError(
    errorImage:Int,
    title:String,
    message:String,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    refreshCallback:()->Unit
){
    // hide all error layout
    networkErrorConfig()


    incSimpleErrorLayout.simpleErrorLayout.isVisible = true
    incLottieErrorLayout.lottieErrorLayout.isVisible = false
    incSimpleErrorLayout.networkErrorIv.setImageResource(errorImage)
    incSimpleErrorLayout.networkErrorTitleTv.text = title
    incSimpleErrorLayout.networkErrorDesTv.text = message
    incSimpleErrorLayout.networkErrorRefreshBtn.setBackgroundResource(buttonDrawable)
    incSimpleErrorLayout.networkErrorRefreshBtn.text = buttonText
    incSimpleErrorLayout.networkErrorRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incSimpleErrorLayout.networkErrorRefreshBtn.setOnClickListener {
        refreshCallback.invoke()
    }
}

//--------show simple lottie error layout------------
fun ViewStateConstraintLayoutBinding.showLottieNetworkError(
    @RawRes lottieRes:Int,
    title:String,
    message:String,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    refreshCallback:()->Unit
){
    // hide all error layout
    networkErrorConfig()

    incLottieErrorLayout.lottieErrorLayout.isVisible = true
    incSimpleErrorLayout.simpleErrorLayout.isVisible = false
    incLottieErrorLayout.networkErrorIv.setAnimation(lottieRes)
    incLottieErrorLayout.networkErrorIv.playAnimation()
    incLottieErrorLayout.networkErrorTitleTv.text = title
    incLottieErrorLayout.networkErrorDesTv.text = message
    incLottieErrorLayout.networkErrorRefreshBtn.setBackgroundResource(buttonDrawable)
    incLottieErrorLayout.networkErrorRefreshBtn.text = buttonText
    incLottieErrorLayout.networkErrorRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incLottieErrorLayout.networkErrorRefreshBtn.setOnClickListener {
        if (refreshButtonViewSateManageFlag){
            hideNetworkErrorLayout()
        }
        refreshCallback.invoke()
    }
}


private fun ViewStateConstraintLayoutBinding.networkErrorConfig(){
    hideProgressLayout()
    hideDataEmptyLayout()
}


fun ViewStateConstraintLayoutBinding.hideNetworkErrorLayout(){
    incSimpleErrorLayout.simpleErrorLayout.isVisible = false
    incLottieErrorLayout.lottieErrorLayout.isVisible = false
    incLottieErrorLayout.networkErrorIv.cancelAnimation()
}