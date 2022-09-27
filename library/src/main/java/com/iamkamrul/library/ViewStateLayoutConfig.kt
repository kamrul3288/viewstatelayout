package com.iamkamrul.library
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes

object ViewStateLayoutConfig {
    var networkErrorTitleText:String = ""
    var networkErrorTitleTextSize:Float = 22.0f

    var networkErrorMessageText:String = ""
    var networkErrorMessageTextSize:Float = 16.0f

    @DrawableRes var networkErrorButtonBg = R.drawable.bg_orange_border_radius_30
    @DrawableRes var networkErrorButtonStartDrawable:Int? = null
    @ColorRes var networkButtonTextColor = R.color.white

    @DrawableRes var networkErrorImage = R.drawable.ic_no_internet
    @RawRes var networkErrorLottieImage = R.raw.animation_no_internet


    var dataEmptyTitleTextSize:Float = 22.0f
    var dataEmptyMessageTextSize:Float = 16.0f

    @DrawableRes var dataEmptyButtonBg = R.drawable.bg_orange_border_radius_30
    @ColorRes var dataEmptyButtonTextColor = R.color.white

    @DrawableRes var dataEmptyImage = R.drawable.ic_no_result
    @RawRes var dataEmptyLottieImage = R.raw.animation_no_data

    @ColorRes var progressBarColor = R.color.orange
    @RawRes var progressBarLottie = R.raw.animation_loading

    var refreshButtonViewSateManageFlag = true

    var dataEmptyButtonText = "Refresh"
    var networkErrorButtonText = "Refresh"

}