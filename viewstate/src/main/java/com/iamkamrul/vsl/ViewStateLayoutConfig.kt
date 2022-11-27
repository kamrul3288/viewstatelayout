package com.iamkamrul.vsl
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
typealias VslConfig = ViewStateLayoutConfig
object ViewStateLayoutConfig {
    var networkErrorTitleText:String = ""
    var networkErrorTitleTextSize:Float = 22.0f

    var networkErrorMessageText:String = ""
    var networkErrorMessageTextSize:Float = 16.0f

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorButtonDrawableRes"))
    @DrawableRes var networkErrorButtonBg = R.drawable.viewstate_bg_orange_border_radius_30
    @DrawableRes var networkErrorButtonDrawableRes = networkErrorButtonBg

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorButtonStartDrawableRes"))
    @DrawableRes var networkErrorButtonStartDrawable:Int? = null
    @DrawableRes var networkErrorButtonStartDrawableRes:Int? = networkErrorButtonStartDrawable
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorButtonTextColor"))
    @ColorRes var networkButtonTextColor = R.color.white
    @ColorRes var networkErrorButtonTextColor = networkButtonTextColor

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorImageDrawableRes"))
    @DrawableRes var networkErrorImage = R.drawable.ic_view_state_no_internet
    @DrawableRes var networkErrorImageDrawableRes = networkErrorImage
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorLottieImageRawRes"))
    @RawRes var networkErrorLottieImage = R.raw.animation_no_internet
    @RawRes var networkErrorLottieImageRawRes = networkErrorLottieImage


    var dataEmptyTitleText:String = ""
    var dataEmptyTitleTextSize:Float = 22.0f

    var dataEmptyMessageText:String = ""
    var dataEmptyMessageTextSize:Float = 16.0f

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("dataEmptyButtonBgDrawableRes"))
    @DrawableRes var dataEmptyButtonBg = R.drawable.viewstate_bg_orange_border_radius_30
    @DrawableRes var dataEmptyButtonBgDrawableRes = dataEmptyButtonBg
    @ColorRes var dataEmptyButtonTextColor = R.color.white

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("dataEmptyImageDrawableRes"))
    @DrawableRes var dataEmptyImage = R.drawable.ic_viewstae_no_result
    @DrawableRes var dataEmptyImageDrawableRes = dataEmptyImage
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("dataEmptyLottieImageRawRes"))
    @RawRes var dataEmptyLottieImage = R.raw.animation_no_data
    @RawRes var dataEmptyLottieImageRawRes = dataEmptyLottieImage

    @ColorRes var progressBarColor = R.color.orange
    @RawRes var progressBarLottie = R.raw.animation_loading

    var dataEmptyButtonText = "Refresh"
    var dataEmptyButtonTextSize:Float = 16.0f

    var networkErrorButtonText = "Refresh"
    var networkErrorButtonTextSize:Float = 16.0f

    @ColorRes var progressbarViewBackgroundResources:Int = R.color.white
    @ColorRes var networkErrorViewBackgroundResources:Int = R.color.white
    @ColorRes var dataEmptyViewBackgroundResources:Int = R.color.white

}