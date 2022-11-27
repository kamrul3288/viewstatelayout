package com.iamkamrul.vsl.extension

import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.vsl.databinding.ViewStateConstraintLayoutBinding
import com.iamkamrul.vsl.utils.clickWithDebounce

fun ViewStateConstraintLayoutBinding.dataEmptyView(
    emptyImage:Int,
    title: String,
    titleTextFontSize:Float,
    message:String,
    messageTextFontSize: Float,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonTextSize:Float,
    buttonDrawable:Int,
    buttonTextColor:Int,
    buttonStartDrawable:Int?,
    backgroundColor:Int,
    refreshCallback:()->Unit
){
    // hide all error layout
    dataEmptyConfig()

    //set background color
    incSimpleDataEmptyLayout.root.setBackgroundResource(backgroundColor)

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
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.textSize = buttonTextSize
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.text = buttonText
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.clickWithDebounce {
        refreshCallback.invoke()
    }
    buttonStartDrawable?.let {
        incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setCompoundDrawablesWithIntrinsicBounds(it,0,0,0)
    }
}

fun ViewStateConstraintLayoutBinding.dataEmptyLottieView(
    lottieRes:Int,
    title: String,
    titleTextFontSize:Float,
    message:String,
    messageTextFontSize: Float,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonTextSize:Float,
    buttonDrawable:Int,
    buttonTextColor:Int,
    buttonStartDrawable:Int?,
    backgroundColor:Int,
    refreshCallback:()->Unit
){

    // hide all error layout
    dataEmptyConfig()

    //set background color
    incLottieDataEmptyLayout.root.setBackgroundResource(backgroundColor)

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
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.textSize = buttonTextSize
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.text = buttonText
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incLottieDataEmptyLayout.dataEmptyRefreshBtn.clickWithDebounce {
        refreshCallback.invoke()
    }
    buttonStartDrawable?.let {
        incLottieDataEmptyLayout.dataEmptyRefreshBtn.setCompoundDrawablesWithIntrinsicBounds(it,0,0,0)
    }
}

private fun ViewStateConstraintLayoutBinding.dataEmptyConfig(){
    hideProgressLayout()
    goneNetworkErrorView()
}


fun ViewStateConstraintLayoutBinding.goneDataEmptyView(){
    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = false
    incLottieDataEmptyLayout.lottieDataEmptyLayout.isVisible = false
    incLottieDataEmptyLayout.dataEmptyIv.cancelAnimation()
}