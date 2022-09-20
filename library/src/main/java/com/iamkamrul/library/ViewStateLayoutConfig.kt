package com.iamkamrul.library

import android.graphics.Typeface

object ViewStateLayoutConfig {
    var networkErrorTitleTextSize:Float = 22.0f
    var networkErrorMessageTextSize:Float = 16.0f

    var networkErrorButtonBg = R.drawable.bg_orange_border_radius_30
    var networkRetryButtonTextColor = R.color.white

    var networkErrorImage = R.drawable.ic_no_internet
    var networkErrorLottieImage = R.raw.animation_no_internet


    var dataEmptyTitleTextSize:Int = 18
    var dataEmptyMessageTextSize:Int = 14

    var dataEmptyRetryButtonBg = R.drawable.bg_orange_border_radius_30
    var dataEmptyButtonTextColor = R.color.white

    var dataEmptyImage = R.drawable.ic_no_result
    var dataEmptyLottieImage = R.raw.animation_no_data

    var progressBarColor = R.color.orange
    var progressBarLottie = R.raw.animation_loading

    var refreshButtonViewSateManageFlag = true

}