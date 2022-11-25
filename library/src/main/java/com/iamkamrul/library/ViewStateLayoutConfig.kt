package com.iamkamrul.library
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes

object ViewStateLayoutConfig {
    var networkErrorTitleText:String = ""
    var networkErrorTitleTextSize:Float = 22.0f

    var networkErrorMessageText:String = ""
    var networkErrorMessageTextSize:Float = 16.0f

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorButtonDrawableRes"))
    @DrawableRes var networkErrorButtonBg = R.drawable.bg_orange_border_radius_30
    @DrawableRes var networkErrorButtonDrawableRes = networkErrorButtonBg

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorButtonStartDrawableRes"))
    @DrawableRes var networkErrorButtonStartDrawable:Int? = null
    @DrawableRes var networkErrorButtonStartDrawableRes:Int? = networkErrorButtonStartDrawable
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorButtonTextColor"))
    @ColorRes var networkButtonTextColor = R.color.white
    @ColorRes var networkErrorButtonTextColor = networkButtonTextColor

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorImageDrawableRes"))
    @DrawableRes var networkErrorImage = R.drawable.ic_no_internet
    @DrawableRes var networkErrorImageDrawableRes = networkErrorImage
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorLottieImageRawRes"))
    @RawRes var networkErrorLottieImage = R.raw.animation_no_internet
    @RawRes var networkErrorLottieImageRawRes = networkErrorLottieImage


    var dataEmptyTitleText:String = ""
    var dataEmptyTitleTextSize:Float = 22.0f

    var dataEmptyMessageText:String = ""
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