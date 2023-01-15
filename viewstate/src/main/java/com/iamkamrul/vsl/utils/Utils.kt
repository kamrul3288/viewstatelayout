package com.iamkamrul.vsl.utils

import android.os.SystemClock
import android.view.View
import android.view.ViewGroup
import androidx.core.view.forEach
import androidx.core.view.isVisible
import com.iamkamrul.vsl.databinding.ViewStateConstraintLayoutBinding

private  var mLastClickTime: Long = 0
fun View.clickWithDebounce(action: (View) -> Unit) {
    this.setOnClickListener {
        if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) return@setOnClickListener
        else action(this)
        mLastClickTime = SystemClock.elapsedRealtime()
    }
}

fun ViewStateConstraintLayoutBinding.resetViewState(){
    changeMainViewVisibility()

    //hide progress bar view
    incLottieProgressLayout.lottieProgressBarLayout.isVisible = false
    incLottieProgressLayout.lottieProgressBar.cancelAnimation()
    incSimpleProgress.simpleProgressParent.isVisible = false

    //hide network view
    incSimpleErrorLayout.simpleErrorLayout.isVisible = false
    incLottieErrorLayout.lottieErrorLayout.isVisible = false
    incLottieErrorLayout.networkErrorIv.cancelAnimation()

    //hide data empty
    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = false
    incLottieDataEmptyLayout.lottieDataEmptyLayout.isVisible = false
    incLottieDataEmptyLayout.dataEmptyIv.cancelAnimation()
}



fun ViewStateConstraintLayoutBinding.changeMainViewVisibility(status:Boolean = false){
    (parentCl.parent as ViewGroup).forEach {
        if (it.id != parentCl.id){
            it.isVisible = !status
        }
    }
}