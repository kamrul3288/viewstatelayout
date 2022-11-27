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
        progressBarColor:Int = ViewStateLayoutConfig.progressBarColor
    ){
       binding.progressbarView(
           progressStatus = progressStatus,
           progressBarColor = progressBarColor
       )
    }

    fun progressbarView(
        progressStatus:Boolean,
        progressBarColor:Int = ViewStateLayoutConfig.progressBarColor
    ){
        binding.progressbarView(
            progressStatus = progressStatus,
            progressBarColor = progressBarColor
        )
    }


    // show and hide lottie progressbar
    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("progressBarLottieView"))
    fun setLottieProgressBarStatusLayout(
        progressStatus:Boolean,
        lottieRes:Int = ViewStateLayoutConfig.progressBarLottie
    ){
        binding.progressBarLottieView(
            progressStatus = progressStatus,
            lottieRes = lottieRes
        )
    }
    fun progressBarLottieView(
        progressStatus:Boolean,
        lottieRes:Int = ViewStateLayoutConfig.progressBarLottie
    ){
        binding.progressBarLottieView(
            progressStatus = progressStatus,
            lottieRes = lottieRes
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
        @DrawableRes errorImage:Int = ViewStateLayoutConfig.networkErrorImageDrawableRes,
        title:String = ViewStateLayoutConfig.networkErrorTitleText,
        titleTextFontSize:Float = ViewStateLayoutConfig.networkErrorTitleTextSize,
        message:String = ViewStateLayoutConfig.networkErrorMessageText,
        messageTextFontSize:Float = ViewStateLayoutConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = ViewStateLayoutConfig.networkErrorButtonText,
        buttonTextSize:Float = ViewStateLayoutConfig.networkErrorButtonTextSize,
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.networkErrorButtonDrawableRes,
        @ColorRes buttonTextColor:Int = ViewStateLayoutConfig.networkErrorButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = ViewStateLayoutConfig.networkErrorButtonStartDrawableRes,
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
           refreshCallback = refreshCallback,
       )
    }

    fun networkErrorView(
        @DrawableRes errorImage:Int = ViewStateLayoutConfig.networkErrorImageDrawableRes,
        title:String = ViewStateLayoutConfig.networkErrorTitleText,
        titleTextFontSize:Float = ViewStateLayoutConfig.networkErrorTitleTextSize,
        message:String = ViewStateLayoutConfig.networkErrorMessageText,
        messageTextFontSize:Float = ViewStateLayoutConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = ViewStateLayoutConfig.networkErrorButtonText,
        buttonTextSize:Float = ViewStateLayoutConfig.networkErrorButtonTextSize,
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.networkErrorButtonDrawableRes,
        @ColorRes buttonTextColor:Int = ViewStateLayoutConfig.networkErrorButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = ViewStateLayoutConfig.networkErrorButtonStartDrawableRes,
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
            refreshCallback = refreshCallback,
        )
    }

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("networkErrorLottieView"))
    fun showLottieNetworkErrorLayout(
        @RawRes lottieRes:Int = ViewStateLayoutConfig.networkErrorLottieImageRawRes,
        title:String = ViewStateLayoutConfig.networkErrorTitleText,
        titleTextFontSize:Float = ViewStateLayoutConfig.networkErrorTitleTextSize,
        message:String = ViewStateLayoutConfig.networkErrorMessageText,
        messageTextFontSize:Float = ViewStateLayoutConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = ViewStateLayoutConfig.networkErrorButtonText,
        buttonTextSize:Float = ViewStateLayoutConfig.networkErrorButtonTextSize,
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.networkErrorButtonDrawableRes,
        @ColorRes buttonTextColor:Int = ViewStateLayoutConfig.networkErrorButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = ViewStateLayoutConfig.networkErrorButtonStartDrawableRes,
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
            refreshCallback = refreshCallback,
        )
    }

    fun networkErrorLottieView(
        @RawRes lottieRes:Int = ViewStateLayoutConfig.networkErrorLottieImageRawRes,
        title:String = ViewStateLayoutConfig.networkErrorTitleText,
        titleTextFontSize:Float = ViewStateLayoutConfig.networkErrorTitleTextSize,
        message:String = ViewStateLayoutConfig.networkErrorMessageText,
        messageTextFontSize:Float = ViewStateLayoutConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = ViewStateLayoutConfig.networkErrorButtonText,
        buttonTextSize:Float = ViewStateLayoutConfig.networkErrorButtonTextSize,
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.networkErrorButtonDrawableRes,
        @ColorRes buttonTextColor:Int = ViewStateLayoutConfig.networkErrorButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = ViewStateLayoutConfig.networkErrorButtonStartDrawableRes,
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
        @DrawableRes emptyImage:Int = ViewStateLayoutConfig.dataEmptyImageDrawableRes,
        title: String = ViewStateLayoutConfig.dataEmptyTitleText,
        titleTextFontSize:Float = ViewStateLayoutConfig.dataEmptyTitleTextSize,
        message:String = ViewStateLayoutConfig.dataEmptyMessageText,
        messageTextFontSize: Float = ViewStateLayoutConfig.dataEmptyMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = ViewStateLayoutConfig.dataEmptyButtonText,
        buttonTextSize:Float = ViewStateLayoutConfig.dataEmptyButtonTextSize,
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.dataEmptyButtonBgDrawableRes,
        @ColorRes buttonTextColor:Int = ViewStateLayoutConfig.dataEmptyButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = null,
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
            refreshCallback = refreshCallback,
        )
    }

    fun dataEmptyView(
        @DrawableRes emptyImage:Int = ViewStateLayoutConfig.dataEmptyImageDrawableRes,
        title: String = ViewStateLayoutConfig.dataEmptyTitleText,
        titleTextFontSize:Float = ViewStateLayoutConfig.dataEmptyTitleTextSize,
        message:String = ViewStateLayoutConfig.dataEmptyMessageText,
        messageTextFontSize: Float = ViewStateLayoutConfig.dataEmptyMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = ViewStateLayoutConfig.dataEmptyButtonText,
        buttonTextSize:Float = ViewStateLayoutConfig.dataEmptyButtonTextSize,
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.dataEmptyButtonBgDrawableRes,
        @ColorRes buttonTextColor:Int = ViewStateLayoutConfig.dataEmptyButtonTextColor,
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
            refreshCallback = refreshCallback,
        )
    }

    @Deprecated(message = "Naming convention mismatch", replaceWith = ReplaceWith("dataEmptyLottieView"))
    fun showLottieDataEmptyLayout(
        lottieRes:Int = ViewStateLayoutConfig.dataEmptyLottieImageRawRes,
        title: String = ViewStateLayoutConfig.dataEmptyTitleText,
        titleTextFontSize:Float = ViewStateLayoutConfig.dataEmptyTitleTextSize,
        message:String = ViewStateLayoutConfig.dataEmptyMessageText,
        messageTextFontSize: Float = ViewStateLayoutConfig.dataEmptyMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = ViewStateLayoutConfig.dataEmptyButtonText,
        buttonTextSize:Float = ViewStateLayoutConfig.dataEmptyButtonTextSize,
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.dataEmptyButtonBgDrawableRes,
        @ColorRes buttonTextColor:Int = ViewStateLayoutConfig.dataEmptyButtonTextColor,
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
            refreshCallback = refreshCallback,
        )
    }

    fun dataEmptyLottieView(
        lottieRes:Int = ViewStateLayoutConfig.dataEmptyLottieImageRawRes,
        title: String = ViewStateLayoutConfig.dataEmptyTitleText,
        titleTextFontSize:Float = ViewStateLayoutConfig.dataEmptyTitleTextSize,
        message:String = ViewStateLayoutConfig.dataEmptyMessageText,
        messageTextFontSize: Float = ViewStateLayoutConfig.dataEmptyMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = ViewStateLayoutConfig.dataEmptyButtonText,
        buttonTextSize:Float = ViewStateLayoutConfig.dataEmptyButtonTextSize,
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.dataEmptyButtonBgDrawableRes,
        @ColorRes buttonTextColor:Int = ViewStateLayoutConfig.dataEmptyButtonTextColor,
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