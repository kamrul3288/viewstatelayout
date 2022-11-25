package com.iamkamrul.library.extension

import android.content.res.ColorStateList
import androidx.annotation.RawRes
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding

// show simple progress bar
internal fun ViewStateConstraintLayoutBinding.progressbarView(
    progressStatus:Boolean,
    progressBarColor:Int
){
    // hide all error layout
    progressBarConfig()

    incSimpleProgress.progressBar.indeterminateTintList = ColorStateList.valueOf(ContextCompat.getColor(parentCl.context,progressBarColor))
    incSimpleProgress.simpleProgressParent.isVisible = progressStatus
    incLottieProgressLayout.lottieProgressBarLayout.isVisible = false
}


// show lottie progress bar
internal fun ViewStateConstraintLayoutBinding.progressBarLottieView(
    progressStatus:Boolean,
    @RawRes lottieRes:Int
){
    // hide all error layout
    progressBarConfig()

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
