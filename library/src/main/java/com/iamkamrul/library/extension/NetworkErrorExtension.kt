package com.iamkamrul.library.extension

import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.library.ViewStateLayoutConfig
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding

//--------show simple network error layout------------
fun ViewStateConstraintLayoutBinding.showSimpleNetworkError(
    errorImage:Int,
    title:String,
    titleTextFontSize:Float,
    message:String,
    messageTextFontSize:Float,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonDrawable:Int,
    buttonStartDrawable:Int?,
    buttonTextColor:Int,
    refreshCallback:()->Unit
){
    // hide all error layout
    networkErrorConfig()

    // show simple network error layout
    incSimpleErrorLayout.simpleErrorLayout.isVisible = true
    // hide lottie network error layout
    incLottieErrorLayout.lottieErrorLayout.isVisible = false
    //set refresh button visibility
    incSimpleErrorLayout.networkErrorRefreshBtn.isVisible = refreshButtonVisibility

    //title and message visibility
    incSimpleErrorLayout.networkErrorTitleTv.isVisible = title.isNotEmpty()
    incSimpleErrorLayout.networkErrorDesTv.isVisible = message.isNotEmpty()

    //title and message font size
    incSimpleErrorLayout.networkErrorTitleTv.textSize = titleTextFontSize
    incSimpleErrorLayout.networkErrorDesTv.textSize = messageTextFontSize

    incSimpleErrorLayout.networkErrorIv.setImageResource(errorImage)
    incSimpleErrorLayout.networkErrorTitleTv.text = title
    incSimpleErrorLayout.networkErrorDesTv.text = message

    incSimpleErrorLayout.networkErrorRefreshBtn.setBackgroundResource(buttonDrawable)
    incSimpleErrorLayout.networkErrorRefreshBtn.text = buttonText
    incSimpleErrorLayout.networkErrorRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incSimpleErrorLayout.networkErrorRefreshBtn.setOnClickListener {
        refreshCallback.invoke()
    }
    buttonStartDrawable?.let {
        incSimpleErrorLayout.networkErrorRefreshBtn.setCompoundDrawablesWithIntrinsicBounds(it,0,0,0)
    }
}

//--------show simple lottie error layout------------
fun ViewStateConstraintLayoutBinding.showLottieNetworkError(
    lottieRes:Int,
    title:String,
    titleTextFontSize:Float,
    message:String,
    messageTextFontSize:Float,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    buttonStartDrawable:Int?,
    refreshCallback:()->Unit
){
    // hide all error layout
    networkErrorConfig()

    // show lottie network error layout
    incLottieErrorLayout.lottieErrorLayout.isVisible = true
    // hide simple network error layout
    incSimpleErrorLayout.simpleErrorLayout.isVisible = false
    //set refresh button visibility
    incLottieErrorLayout.networkErrorRefreshBtn.isVisible = refreshButtonVisibility

    //title and message visibility
    incLottieErrorLayout.networkErrorTitleTv.isVisible = title.isNotEmpty()
    incLottieErrorLayout.networkErrorDesTv.isVisible = message.isNotEmpty()

    //title and message font size
    incLottieErrorLayout.networkErrorTitleTv.textSize = titleTextFontSize
    incLottieErrorLayout.networkErrorDesTv.textSize = messageTextFontSize

    incLottieErrorLayout.networkErrorIv.setAnimation(lottieRes)
    incLottieErrorLayout.networkErrorIv.playAnimation()
    incLottieErrorLayout.networkErrorTitleTv.text = title
    incLottieErrorLayout.networkErrorDesTv.text = message
    incLottieErrorLayout.networkErrorRefreshBtn.setBackgroundResource(buttonDrawable)
    incLottieErrorLayout.networkErrorRefreshBtn.text = buttonText
    incLottieErrorLayout.networkErrorRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incLottieErrorLayout.networkErrorRefreshBtn.setOnClickListener {
        if (ViewStateLayoutConfig.refreshButtonViewSateManageFlag){
            hideNetworkErrorLayout()
        }
        refreshCallback.invoke()
    }
    buttonStartDrawable?.let {
        incLottieErrorLayout.networkErrorRefreshBtn.setCompoundDrawablesWithIntrinsicBounds(it,0,0,0)
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