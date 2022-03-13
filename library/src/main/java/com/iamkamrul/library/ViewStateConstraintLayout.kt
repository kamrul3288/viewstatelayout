package com.iamkamrul.library

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding
import com.iamkamrul.library.extension.lottieProgressBarStatus
import com.iamkamrul.library.extension.showSimpleDataEmptyView
import com.iamkamrul.library.extension.simpleProgressBarStatus

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
    fun setSimpleProgressBarStatus(
        progressStatus:Boolean,
        progressBarColor:Int = R.color.orange
    ){
       binding.simpleProgressBarStatus(
           progressStatus = progressStatus,
           progressBarColor = progressBarColor
       )
    }

    // show and hide lottie progressbar
    fun setLottieProgressBarStatus(
        progressStatus:Boolean,
        lottieRes:Int = R.raw.animation_loading
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
    fun showSimpleNetworkError(
        errorImage:Int = R.drawable.ic_no_internet,
        title:String = context.getString(R.string.title_no_internet),
        message:String = context.getString(R.string.message_no_internet),
        buttonText:String = context.getString(R.string.button_refresh),
        buttonDrawable:Int = R.drawable.bg_orange_border_radius_30,
        buttonTextColor:Int = R.color.white,
        refreshCallback:()->Unit
    ){
        binding.incSimpleErrorLayout.simpleErrorLayout.isVisible = true
        binding.incSimpleErrorLayout.networkErrorIv.setImageResource(errorImage)
        binding.incSimpleErrorLayout.networkErrorTitleTv.text = title
        binding.incSimpleErrorLayout.networkErrorDesTv.text = message
        binding.incSimpleErrorLayout.networkErrorRefreshBtn.setBackgroundResource(buttonDrawable)
        binding.incSimpleErrorLayout.networkErrorRefreshBtn.text = buttonText
        binding.incSimpleErrorLayout.networkErrorRefreshBtn.setTextColor(ContextCompat.getColor(context,buttonTextColor))
        binding.incSimpleErrorLayout.networkErrorRefreshBtn.setOnClickListener {
            refreshCallback.invoke()
        }
    }

    //hide networkError
    fun hideSimpleNetworkError(){
        binding.incSimpleErrorLayout.simpleErrorLayout.isVisible = false
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
    fun showSimpleDataEmptyView(
        emptyImage:Int = R.drawable.ic_no_result,
        message:String = context.getString(R.string.message_no_data_found),
        buttonText:String = context.getString(R.string.button_refresh),
        buttonDrawable:Int = R.drawable.bg_orange_border_radius_30,
        buttonTextColor:Int = R.color.white,
        refreshCallback:()->Unit
    ){
        binding.showSimpleDataEmptyView(
            emptyImage = emptyImage,
            message = message,
            buttonText = buttonText,
            buttonDrawable = buttonDrawable,
            buttonTextColor = buttonTextColor,
            refreshCallback = refreshCallback,
        )
    }

    //hide networkError
    fun hideSimpleDataEmptyView(){
        binding.incSimpleDataEmptyLayout.simpleDataEmptyLayout.isVisible = false
    }

}