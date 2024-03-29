package com.iamkamrul.vsl.extension

import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.vsl.databinding.ViewStateConstraintLayoutBinding
import com.iamkamrul.vsl.utils.changeMainViewVisibility
import com.iamkamrul.vsl.utils.clickWithDebounce
import com.iamkamrul.vsl.utils.resetViewState

//--------show simple network error layout------------
fun ViewStateConstraintLayoutBinding.networkErrorView(
    errorImage:Int,
    title:String,
    titleTextFontSize:Float,
    message:String,
    messageTextFontSize:Float,
    refreshButtonVisibility:Boolean,
    buttonText:String,
    buttonTextSize:Float,
    buttonDrawable:Int,
    buttonStartDrawable:Int?,
    buttonTextColor:Int,
    backgroundColor:Int,
    refreshCallback:()->Unit
){
    // hide all error layout
    resetViewState()

    //set background color
    incSimpleErrorLayout.root.setBackgroundResource(backgroundColor)

    // show simple network error layout
    incSimpleErrorLayout.simpleErrorLayout.isVisible = true

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
    incSimpleErrorLayout.networkErrorRefreshBtn.textSize = buttonTextSize
    incSimpleErrorLayout.networkErrorRefreshBtn.text = buttonText
    incSimpleErrorLayout.networkErrorRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incSimpleErrorLayout.networkErrorRefreshBtn.clickWithDebounce {
        refreshCallback.invoke()
    }
    buttonStartDrawable?.let {
        incSimpleErrorLayout.networkErrorRefreshBtn.setCompoundDrawablesWithIntrinsicBounds(it,0,0,0)
    }

    //main view visibility
    changeMainViewVisibility(status = true)
}

//--------show simple lottie error layout------------
fun ViewStateConstraintLayoutBinding.networkErrorLottieView(
    lottieRes:Int,
    title:String,
    titleTextFontSize:Float,
    message:String,
    messageTextFontSize:Float,
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
    resetViewState()

    //set background color
    incLottieErrorLayout.root.setBackgroundResource(backgroundColor)

    // show lottie network error layout
    incLottieErrorLayout.lottieErrorLayout.isVisible = true

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
    incLottieErrorLayout.networkErrorRefreshBtn.textSize = buttonTextSize
    incLottieErrorLayout.networkErrorRefreshBtn.text = buttonText
    incLottieErrorLayout.networkErrorRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incLottieErrorLayout.networkErrorRefreshBtn.clickWithDebounce {
        refreshCallback.invoke()
    }
    buttonStartDrawable?.let {
        incLottieErrorLayout.networkErrorRefreshBtn.setCompoundDrawablesWithIntrinsicBounds(it,0,0,0)
    }

    //main view visibility
    changeMainViewVisibility(status = true)
}
