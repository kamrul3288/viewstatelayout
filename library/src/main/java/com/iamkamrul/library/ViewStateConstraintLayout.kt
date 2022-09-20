package com.iamkamrul.library

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.constraintlayout.widget.ConstraintLayout
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding
import com.iamkamrul.library.extension.*

class ViewStateConstraintLayout : ConstraintLayout{

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context,attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr:Int) : super(context,attrs,defStyleAttr)


    private lateinit var binding:ViewStateConstraintLayoutBinding
    override fun onFinishInflate() {
        super.onFinishInflate()
        binding = ViewStateConstraintLayoutBinding.bind(LayoutInflater.from(context).inflate(R.layout.view_state_constraint_layout,this,true))
    }

    // show and hide progressbar
    fun setSimpleProgressBarStatusLayout(
        progressStatus:Boolean,
        progressBarColor:Int = ViewStateLayoutConfig.progressBarColor
    ){
       binding.simpleProgressBarStatus(
           progressStatus = progressStatus,
           progressBarColor = progressBarColor
       )
    }

    // show and hide lottie progressbar
    fun setLottieProgressBarStatusLayout(
        progressStatus:Boolean,
        lottieRes:Int = ViewStateLayoutConfig.progressBarLottie
    ){
        binding.lottieProgressBarStatus(
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
    fun showSimpleNetworkErrorLayout(
        @DrawableRes errorImage:Int = ViewStateLayoutConfig.networkErrorImage,
        title:String = "",
        titleTextFontSize:Float = ViewStateLayoutConfig.networkErrorTitleTextSize,
        message:String = "",
        messageTextFontSize:Float = ViewStateLayoutConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = context.getString(R.string.button_refresh),
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.networkErrorButtonBg,
        @ColorInt buttonTextColor:Int = ViewStateLayoutConfig.networkRetryButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = null,
        refreshCallback:()->Unit
    ){
       binding.showSimpleNetworkError(
           errorImage = errorImage,
           title = title,
           titleTextFontSize = titleTextFontSize,
           message = message,
           messageTextFontSize = messageTextFontSize,
           refreshButtonVisibility = refreshButtonVisibility,
           buttonText = buttonText,
           buttonDrawable = buttonDrawable,
           buttonStartDrawable = buttonStartDrawable,
           buttonTextColor = buttonTextColor,
           refreshCallback = refreshCallback,
       )
    }

    fun showLottieNetworkErrorLayout(
        @RawRes lottieRes:Int = ViewStateLayoutConfig.networkErrorLottieImage,
        title:String = "",
        titleTextFontSize:Float = ViewStateLayoutConfig.networkErrorTitleTextSize,
        message:String = "",
        messageTextFontSize:Float = ViewStateLayoutConfig.networkErrorMessageTextSize,
        refreshButtonVisibility:Boolean = true,
        buttonText:String = context.getString(R.string.button_refresh),
        @DrawableRes buttonDrawable:Int = ViewStateLayoutConfig.networkErrorButtonBg,
        @ColorInt buttonTextColor:Int = ViewStateLayoutConfig.networkRetryButtonTextColor,
        @DrawableRes buttonStartDrawable:Int? = null,
        refreshCallback:()->Unit
    ){
        binding.showLottieNetworkError(
            lottieRes = lottieRes,
            title = title,
            titleTextFontSize = titleTextFontSize,
            refreshButtonVisibility = refreshButtonVisibility,
            message = message,
            messageTextFontSize= messageTextFontSize,
            buttonText = buttonText,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            buttonStartDrawable = buttonStartDrawable,
            refreshCallback = refreshCallback,
        )
    }

    //hide networkError
    fun hideNetworkErrorLayout(){
        binding.hideNetworkErrorLayout()
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
    fun showSimpleDataEmptyLayout(
        emptyImage:Int = R.drawable.ic_no_result,
        message:String = context.getString(R.string.message_no_data_found),
        refreshButtonVisibility:Boolean = true,
        buttonText:String = context.getString(R.string.button_refresh),
        buttonDrawable:Int = R.drawable.bg_orange_border_radius_30,
        buttonTextColor:Int = R.color.white,
        refreshCallback:()->Unit
    ){
        binding.showSimpleDataEmptyView(
            emptyImage = emptyImage,
            message = message,
            refreshButtonVisibility = refreshButtonVisibility,
            buttonText = buttonText,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            refreshCallback = refreshCallback,
        )
    }


    fun showLottieDataEmptyLayout(
        lottieRes:Int = R.raw.animation_no_data,
        message:String = context.getString(R.string.message_no_data_found),
        refreshButtonVisibility:Boolean = true,
        buttonText:String = context.getString(R.string.button_refresh),
        buttonDrawable:Int = R.drawable.bg_orange_border_radius_30,
        buttonTextColor:Int = R.color.white,
        refreshCallback:()->Unit
    ){
        binding.showLottieDataEmptyView(
            lottieRes = lottieRes,
            message = message,
            refreshButtonVisibility = refreshButtonVisibility,
            buttonText = buttonText,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            refreshCallback = refreshCallback,
        )
    }

    //hide networkError
    fun hideDataEmptyLayout(){
        binding.hideDataEmptyLayout()
    }

}