package com.iamkamrul.vsl.utils

import android.os.SystemClock
import android.view.View

private  var mLastClickTime: Long = 0
fun View.clickWithDebounce(action: (View) -> Unit) {
    this.setOnClickListener {
        if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) return@setOnClickListener
        else action(this)
        mLastClickTime = SystemClock.elapsedRealtime()
    }
}