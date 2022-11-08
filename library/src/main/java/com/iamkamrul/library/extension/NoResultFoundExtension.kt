package com.iamkamrul.library.extension

import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.library.ViewStateLayoutConfig
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding
import com.iamkamrul.library.utils.clickWithDebounce

fun ViewStateConstraintLayoutBinding.showSimpleDataEmptyView(
    emptyImage:Int,
    title: String,
    titleTextFontSize:Float,
    message:String,
    messageTextFontSize: Float,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    buttonStartDrawable:Int?,
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

    //title and message visibility
    incSimpleDataEmptyLayout.dataEmptyTitleTv.isVisible = title.isNotEmpty()
    incSimpleDataEmptyLayout.dataEmptyMessageTv.isVisible = message.isNotEmpty()

    //title and message font size
    incSimpleDataEmptyLayout.dataEmptyTitleTv.textSize = titleTextFontSize
    incSimpleDataEmptyLayout.dataEmptyMessageTv.textSize = messageTextFontSize


    incSimpleDataEmptyLayout.dataEmptyIv.setImageResource(emptyImage)
    incSimpleDataEmptyLayout.dataEmptyTitleTv.text = title
    incSimpleDataEmptyLayout.dataEmptyMessageTv.text = message
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setBackgroundResource(buttonDrawable)
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.text = buttonText
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.clickWithDebounce {
        refreshCallback.invoke()
    }
    buttonStartDrawable?.let {
        incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setCompoundDrawablesWithIntrinsicBounds(it,0,0,0)
    }
}

fun ViewStateConstraintLayoutBinding.showLottieDataEmptyView(
    lottieRes:Int,
    title: String,
    titleTextFontSize:Float,
    message:String,
    messageTextFontSize: Float,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    buttonStartDrawable:Int?,
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

    //title and message visibility
    incLottieDataEmptyLayout.dataEmptyTitleTv.isVisible = title.isNotEmpty()
    incLottieDataEmptyLayout.dataEmptyMessageTv.isVisible = message.isNotEmpty()

    //title and message font size
    incLottieDataEmptyLayout.dataEmptyTitleTv.textSize = titleTextFontSize
    incLottieDataEmptyLayout.dataEmptyMessageTv.textSize = messageTextFontSize

    incLottieDataEmptyLayout.dataEmptyIv.setAnimation(lottieRes)
    incLottieDataEmptyLayout.dataEmptyIv.playAnimation()
    incLottieDataEmptyLayout.dataEmptyTitleTv.text = title
    incLottieDataEmptyLayout.dataEmptyMessageTv.text = message
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setBackgroundResource(buttonDrawable)
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.text = buttonText
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.clickWithDebounce {
        if (ViewStateLayoutConfig.refreshButtonViewSateManageFlag){
            hideDataEmptyLayout()
        }
        refreshCallback.invoke()
    }
    buttonStartDrawable?.let {
        incLottieDataEmptyLayout.dataEmptyRefreshBtn.setCompoundDrawablesWithIntrinsicBounds(it,0,0,0)
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