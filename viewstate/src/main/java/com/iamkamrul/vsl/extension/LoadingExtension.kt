package com.iamkamrul.vsl.extension

import android.content.res.ColorStateList
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.vsl.databinding.ViewStateConstraintLayoutBinding
import com.iamkamrul.vsl.utils.changeMainViewVisibility
import com.iamkamrul.vsl.utils.resetViewState

// show simple progress bar
internal fun ViewStateConstraintLayoutBinding.progressbarView(
    progressStatus:Boolean,
    progressBarColor:Int,
    backgroundColor:Int
){
    // hide all error layout
    resetViewState()

    //set background color
    incSimpleProgress.root.setBackgroundResource(backgroundColor)

    incSimpleProgress.progressBar.indeterminateTintList = ColorStateList.valueOf(ContextCompat.getColor(parentCl.context,progressBarColor))
    incSimpleProgress.simpleProgressParent.isVisible = progressStatus

    //main view visibility
    changeMainViewVisibility(progressStatus)

}


// show lottie progress bar
internal fun ViewStateConstraintLayoutBinding.progressBarLottieView(
    progressStatus:Boolean,
    lottieRes:Int,
    backgroundColor: Int
){
    // hide all error layout
    resetViewState()

    //set background color
    incLottieProgressLayout.root.setBackgroundResource(backgroundColor)

    incLottieProgressLayout.lottieProgressBarLayout.isVisible = progressStatus
    if (progressStatus){
        incLottieProgressLayout.lottieProgressBar.setAnimation(lottieRes)
        incLottieProgressLayout.lottieProgressBar.playAnimation()
    }else{
        incLottieProgressLayout.lottieProgressBar.cancelAnimation()
    }

    //main view visibility
    changeMainViewVisibility(progressStatus)
}
