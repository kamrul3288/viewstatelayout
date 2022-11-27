package com.iamkamrul.vsl.extension

import android.content.res.ColorStateList
import androidx.annotation.RawRes
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.vsl.databinding.ViewStateConstraintLayoutBinding

// show simple progress bar
internal fun ViewStateConstraintLayoutBinding.progressbarView(
    progressStatus:Boolean,
    progressBarColor:Int,
    backgroundColor:Int
){
    // hide all error layout
    progressBarConfig()

    //set background color
    incSimpleProgress.root.setBackgroundResource(backgroundColor)

    incSimpleProgress.progressBar.indeterminateTintList = ColorStateList.valueOf(ContextCompat.getColor(parentCl.context,progressBarColor))
    incSimpleProgress.simpleProgressParent.isVisible = progressStatus
    incLottieProgressLayout.lottieProgressBarLayout.isVisible = false
}


// show lottie progress bar
internal fun ViewStateConstraintLayoutBinding.progressBarLottieView(
    progressStatus:Boolean,
    lottieRes:Int,
    backgroundColor: Int
){
    // hide all error layout
    progressBarConfig()

    //set background color
    incLottieProgressLayout.root.setBackgroundResource(backgroundColor)

    incLottieProgressLayout.lottieProgressBarLayout.isVisible = progressStatus
    incSimpleProgress.simpleProgressParent.isVisible = false
    if (progressStatus){
        incLottieProgressLayout.lottieProgressBar.setAnimation(lottieRes)
        incLottieProgressLayout.lottieProgressBar.playAnimation()
    }else{
        incLottieProgressLayout.lottieProgressBar.cancelAnimation()
    }
}

private fun ViewStateConstraintLayoutBinding.progressBarConfig(){
    goneDataEmptyView()
    goneNetworkErrorView()
}

// hide progress bar when network error & data empty error showing
internal fun ViewStateConstraintLayoutBinding.hideProgressLayout(){
    incLottieProgressLayout.lottieProgressBarLayout.isVisible = false
    incLottieProgressLayout.lottieProgressBar.cancelAnimation()
    incSimpleProgress.simpleProgressParent.isVisible = false
}
