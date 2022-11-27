package com.iamkamrul.vsl

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.constraintlayout.widget.ConstraintLayout
import com.iamkamrul.vsl.databinding.ViewStateConstraintLayoutBinding
import com.iamkamrul.vsl.extension.*

class ConstraintLayout : ConstraintLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context,attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr:Int) : super(context,attrs,defStyleAttr)


    private lateinit var binding:ViewStateConstraintLayoutBinding
    override fun onFinishInflate() {
        super.onFinishInflate()
        binding = ViewStateConstraintLayoutBinding.bind(LayoutInflater.from(context).inflate(R.layout.view_state_constraint_layout,this,true))
    }

    // show and hide progressbar
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("progressbarView"))
    fun setSimpleProgressBarStatusLayout(
        progressStatus:Boolean,
        progressBarColor:Int = VslConfig.progressBarColor,
        @ColorRes backgroundColor:Int = VslConfig.progressbarViewBackgroundResources

    ){
       binding.progressbarView(
           progressStatus = progressStatus,
           progressBarColor = progressBarColor,
           backgroundColor = backgroundColor,
       )
    }

    fun progressbarView(
        progressStatus:Boolean,
        progressBarColor:Int = VslConfig.progressBarColor,
        @ColorRes backgroundColor:Int = VslConfig.progressbarViewBackgroundResources
    ){
        binding.progressbarView(
            progressStatus = progressStatus,
            progressBarColor = progressBarColor,
            backgroundColor = backgroundColor,
        )
    }


    // show and hide lottie progressbar
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("progressBarLottieView"))
    fun setLottieProgressBarStatusLayout(
        progressStatus:Boolean,
        lottieRes:Int = VslConfig.progressBarLottie,
        @ColorRes backgroundColor:Int = VslConfig.progressbarViewBackgroundResources
    ){
        binding.progressBarLottieView(
            progressStatus = progressStatus,
            lottieRes = lottieRes,
            backgroundColor = backgroundColor,
        )
    }
    fun progressBarLottieView(
        progressStatus:Boolean,
        lottieRes:Int = VslConfig.progressBarLottie,
        @ColorRes backgroundColor:Int = VslConfig.progressbarViewBackgroundResources
    ){
        binding.progressBarLottieView(
            progressStatus = progressStatus,
            lottieRes = lottieRes,
            backgroundColor = backgroundColor,
        )
    }

    /*
    * showing network error layout
    * @errorImage is the Network error thumb image
    * @title is the network title
    * @message is the network message
    * @buttonText is the button text
    * @buttonDrawable is button drawable. for ex button bg
    * @buttonTextColor button text color
    * @refreshCallback send to refresh callback
    **/
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorView"))
    fun showSimpleNetworkErrorLayout(
        @DrawableRes errorImage:Int = VslConfig.networkErrorImageDrawableRes,
        title:String = VslConfig.networkErrorTitleText,
        titleTextFontSize:Float = VslConfig.networkErrorTitleTextSize,
        message:String = VslConfig.networkErrorMessageText,
        messageTextFontSize:Float = VslConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = VslConfig.networkErrorButtonText,
        buttonTextSize:Float = VslConfig.networkErrorButtonTextSize,
        @DrawableRes buttonDrawable:Int = VslConfig.networkErrorButtonDrawableRes,
        @ColorRes buttonTextColor:Int = VslConfig.networkErrorButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = VslConfig.networkErrorButtonStartDrawableRes,
        @ColorRes backgroundColor:Int = VslConfig.networkErrorViewBackgroundResources,
        refreshCallback:()->Unit = {}
    ){
       binding.networkErrorView(
           errorImage = errorImage,
           title = title,
           titleTextFontSize = titleTextFontSize,
           message = message,
           messageTextFontSize = messageTextFontSize,
           refreshButtonVisibility = refreshButtonVisibility,
           buttonText = buttonText,
           buttonTextSize = buttonTextSize,
           buttonDrawable = buttonDrawable,
           buttonStartDrawable = buttonStartDrawable,
           buttonTextColor = buttonTextColor,
           backgroundColor = backgroundColor,
           refreshCallback = refreshCallback,
       )
    }

    fun networkErrorView(
        @DrawableRes errorImage:Int = VslConfig.networkErrorImageDrawableRes,
        title:String = VslConfig.networkErrorTitleText,
        titleTextFontSize:Float = VslConfig.networkErrorTitleTextSize,
        message:String = VslConfig.networkErrorMessageText,
        messageTextFontSize:Float = VslConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = VslConfig.networkErrorButtonText,
        buttonTextSize:Float = VslConfig.networkErrorButtonTextSize,
        @DrawableRes buttonDrawable:Int = VslConfig.networkErrorButtonDrawableRes,
        @ColorRes buttonTextColor:Int = VslConfig.networkErrorButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = VslConfig.networkErrorButtonStartDrawableRes,
        @ColorRes backgroundColor:Int = VslConfig.networkErrorViewBackgroundResources,
        refreshCallback:()->Unit = {}
    ){
        binding.networkErrorView(
            errorImage = errorImage,
            title = title,
            titleTextFontSize = titleTextFontSize,
            message = message,
            messageTextFontSize = messageTextFontSize,
            refreshButtonVisibility = refreshButtonVisibility,
            buttonText = buttonText,
            buttonTextSize = buttonTextSize,
            buttonDrawable = buttonDrawable,
            buttonStartDrawable = buttonStartDrawable,
            buttonTextColor = buttonTextColor,
            backgroundColor = backgroundColor,
            refreshCallback = refreshCallback,
        )
    }

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorLottieView"))
    fun showLottieNetworkErrorLayout(
        @RawRes lottieRes:Int = VslConfig.networkErrorLottieImageRawRes,
        title:String = VslConfig.networkErrorTitleText,
        titleTextFontSize:Float = VslConfig.networkErrorTitleTextSize,
        message:String = VslConfig.networkErrorMessageText,
        messageTextFontSize:Float = VslConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = VslConfig.networkErrorButtonText,
        buttonTextSize:Float = VslConfig.networkErrorButtonTextSize,
        @DrawableRes buttonDrawable:Int = VslConfig.networkErrorButtonDrawableRes,
        @ColorRes buttonTextColor:Int = VslConfig.networkErrorButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = VslConfig.networkErrorButtonStartDrawableRes,
        @ColorRes backgroundColor:Int = VslConfig.networkErrorViewBackgroundResources,
        refreshCallback:()->Unit = {}
    ){
        binding.networkErrorLottieView(
            lottieRes = lottieRes,
            title = title,
            titleTextFontSize = titleTextFontSize,
            refreshButtonVisibility = refreshButtonVisibility,
            message = message,
            messageTextFontSize= messageTextFontSize,
            buttonText = buttonText,
            buttonTextSize = buttonTextSize,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            buttonStartDrawable = buttonStartDrawable,
            backgroundColor = backgroundColor,
            refreshCallback = refreshCallback,
        )
    }

    fun networkErrorLottieView(
        @RawRes lottieRes:Int = VslConfig.networkErrorLottieImageRawRes,
        title:String = VslConfig.networkErrorTitleText,
        titleTextFontSize:Float = VslConfig.networkErrorTitleTextSize,
        message:String = VslConfig.networkErrorMessageText,
        messageTextFontSize:Float = VslConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = VslConfig.networkErrorButtonText,
        buttonTextSize:Float = VslConfig.networkErrorButtonTextSize,
        @DrawableRes buttonDrawable:Int = VslConfig.networkErrorButtonDrawableRes,
        @ColorRes buttonTextColor:Int = VslConfig.networkErrorButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = VslConfig.networkErrorButtonStartDrawableRes,
        @ColorRes backgroundColor:Int = VslConfig.networkErrorViewBackgroundResources,
        refreshCallback:()->Unit = {}
    ){
        binding.networkErrorLottieView(
            lottieRes = lottieRes,
            title = title,
            titleTextFontSize = titleTextFontSize,
            refreshButtonVisibility = refreshButtonVisibility,
            message = message,
            messageTextFontSize= messageTextFontSize,
            buttonText = buttonText,
            buttonTextSize = buttonTextSize,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            buttonStartDrawable = buttonStartDrawable,
            backgroundColor = backgroundColor,
            refreshCallback = refreshCallback,
        )
    }

    //gone networkError
    fun goneNetworkErrorView(){
        binding.goneNetworkErrorView()
    }
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("goneNetworkErrorView"))
    fun hideNetworkErrorLayout(){
        binding.goneNetworkErrorView()
    }



    /*
    * showing data empty or no search result layout
    * @emptyImage is the data empty thumb image
    * @message is the data empty message
    * @buttonText is the button text
    * @buttonDrawable is button drawable. for ex button bg
    * @buttonTextColor button text color
    * @refreshCallback send to refresh callback
    **/
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("dataEmptyView"))
    fun showSimpleDataEmptyLayout(
        @DrawableRes emptyImage:Int = VslConfig.dataEmptyImageDrawableRes,
        title: String = VslConfig.dataEmptyTitleText,
        titleTextFontSize:Float = VslConfig.dataEmptyTitleTextSize,
        message:String = VslConfig.dataEmptyMessageText,
        messageTextFontSize: Float = VslConfig.dataEmptyMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = VslConfig.dataEmptyButtonText,
        buttonTextSize:Float = VslConfig.dataEmptyButtonTextSize,
        @DrawableRes buttonDrawable:Int = VslConfig.dataEmptyButtonBgDrawableRes,
        @ColorRes buttonTextColor:Int = VslConfig.dataEmptyButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = null,
        @ColorRes backgroundColor:Int = VslConfig.dataEmptyViewBackgroundResources,
        refreshCallback:()->Unit = {}
    ){
        binding.dataEmptyView(
            emptyImage = emptyImage,
            title = title,
            titleTextFontSize = titleTextFontSize,
            message = message,
            messageTextFontSize = messageTextFontSize,
            refreshButtonVisibility = refreshButtonVisibility,
            buttonText = buttonText,
            buttonTextSize= buttonTextSize,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            buttonStartDrawable = buttonStartDrawable,
            backgroundColor = backgroundColor,
            refreshCallback = refreshCallback,
        )
    }

    fun dataEmptyView(
        @DrawableRes emptyImage:Int = VslConfig.dataEmptyImageDrawableRes,
        title: String = VslConfig.dataEmptyTitleText,
        titleTextFontSize:Float = VslConfig.dataEmptyTitleTextSize,
        message:String = VslConfig.dataEmptyMessageText,
        messageTextFontSize: Float = VslConfig.dataEmptyMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = VslConfig.dataEmptyButtonText,
        buttonTextSize:Float = VslConfig.dataEmptyButtonTextSize,
        @DrawableRes buttonDrawable:Int = VslConfig.dataEmptyButtonBgDrawableRes,
        @ColorRes buttonTextColor:Int = VslConfig.dataEmptyButtonTextColor,
        @ColorRes backgroundColor:Int = VslConfig.dataEmptyViewBackgroundResources,
        @DrawableRes buttonStartDrawable:Int? = null,
        refreshCallback:()->Unit
    ){
        binding.dataEmptyView(
            emptyImage = emptyImage,
            title = title,
            titleTextFontSize = titleTextFontSize,
            message = message,
            messageTextFontSize = messageTextFontSize,
            refreshButtonVisibility = refreshButtonVisibility,
            buttonText = buttonText,
            buttonTextSize= buttonTextSize,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            buttonStartDrawable = buttonStartDrawable,
            backgroundColor = backgroundColor,
            refreshCallback = refreshCallback,
        )
    }

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("dataEmptyLottieView"))
    fun showLottieDataEmptyLayout(
        lottieRes:Int = VslConfig.dataEmptyLottieImageRawRes,
        title: String = VslConfig.dataEmptyTitleText,
        titleTextFontSize:Float = VslConfig.dataEmptyTitleTextSize,
        message:String = VslConfig.dataEmptyMessageText,
        messageTextFontSize: Float = VslConfig.dataEmptyMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = VslConfig.dataEmptyButtonText,
        buttonTextSize:Float = VslConfig.dataEmptyButtonTextSize,
        @DrawableRes buttonDrawable:Int = VslConfig.dataEmptyButtonBgDrawableRes,
        @ColorRes buttonTextColor:Int = VslConfig.dataEmptyButtonTextColor,
        @ColorRes backgroundColor:Int = VslConfig.dataEmptyViewBackgroundResources,
        @DrawableRes buttonStartDrawable:Int? = null,
        refreshCallback:()->Unit = {}
    ){
        binding.dataEmptyLottieView(
            lottieRes = lottieRes,
            title = title,
            titleTextFontSize = titleTextFontSize,
            message = message,
            messageTextFontSize = messageTextFontSize,
            refreshButtonVisibility = refreshButtonVisibility,
            buttonText = buttonText,
            buttonTextSize= buttonTextSize,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            buttonStartDrawable = buttonStartDrawable,
            backgroundColor = backgroundColor,
            refreshCallback = refreshCallback,
        )
    }

    fun dataEmptyLottieView(
        lottieRes:Int = VslConfig.dataEmptyLottieImageRawRes,
        title: String = VslConfig.dataEmptyTitleText,
        titleTextFontSize:Float = VslConfig.dataEmptyTitleTextSize,
        message:String = VslConfig.dataEmptyMessageText,
        messageTextFontSize: Float = VslConfig.dataEmptyMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = VslConfig.dataEmptyButtonText,
        buttonTextSize:Float = VslConfig.dataEmptyButtonTextSize,
        @DrawableRes buttonDrawable:Int = VslConfig.dataEmptyButtonBgDrawableRes,
        @ColorRes buttonTextColor:Int = VslConfig.dataEmptyButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = null,
        @ColorRes backgroundColor:Int = VslConfig.dataEmptyViewBackgroundResources,
        refreshCallback:()->Unit = {}
    ){
        binding.dataEmptyLottieView(
            lottieRes = lottieRes,
            title = title,
            titleTextFontSize = titleTextFontSize,
            message = message,
            messageTextFontSize = messageTextFontSize,
            refreshButtonVisibility = refreshButtonVisibility,
            buttonText = buttonText,
            buttonTextSize= buttonTextSize,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            buttonStartDrawable = buttonStartDrawable,
            backgroundColor = backgroundColor,
            refreshCallback = refreshCallback,
        )
    }


    //gone data empty error
    fun goneDataEmptyView(){
        binding.goneDataEmptyView()
    }

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("goneDataEmptyView"))
    fun hideDataEmptyLayout(){
        binding.goneDataEmptyView()
    }

}