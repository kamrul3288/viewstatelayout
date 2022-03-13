package com.iamkamrul.library.extension

import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.library.R
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding

fun ViewStateConstraintLayoutBinding.showSimpleDataEmptyView(
    emptyImage:Int = R.drawable.ic_no_result,
    message:String,
    buttonText:String,
    buttonDrawable:Int,
    buttonTextColor:Int,
    refreshCallback:()->Unit
){
    // hide progress bar
    hideProgressLayout()

    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = true
    incSimpleDataEmptyLayout.dataEmptyIv.setImageResource(emptyImage)
    incSimpleDataEmptyLayout.dataEmptyMessageTv.text = message
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setBackgroundResource(buttonDrawable)
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.text = buttonText
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setTextColor(ContextCompat.getColor(this.root.context,buttonTextColor))
    incSimpleDataEmptyLayout.dataEmptyRefreshBtn.setOnClickListener {
        refreshCallback.invoke()
    }
}

fun ViewStateConstraintLayoutBinding.hideDataEmptyLayout(){
    incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = false
}