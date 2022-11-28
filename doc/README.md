# ViewStateLayout
##### Easy way to manage common state templates like loading, empty, error etc.!

### Table of content
- [XML Configuration](#xml-configuration)
- [Progressbar](#progressbar)
- [Customize Progressbar](#parsing)
- [Network Error View](#customize-progressbar)
- [Customize Network Error View](#network-error-view)
- [Get String date time in Date Object](#customize-network-error-view)
- [Data Empty View](#data-empty-view)
- [Customize Data Empty View](#customize-data-empty-view)
- [Global Configuration](#global-configuration)

### XML Configuration
```xml
<com.iamkamrul.vsl.ConstraintLayout
    android:id="@+id/vsl"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!--put all view here-->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />


</com.iamkamrul.vsl.ConstraintLayout>
```

### Progressbar
```kotlin
// simple progressbar
vsl.progressbarView(progressStatus = true)
vsl.progressbarView(progressStatus = false)
//lottie progressbar
vsl.progressBarLottieView(progressStatus = true)
vsl.progressBarLottieView(progressStatus = false)
```
### Customize Progressbar
```kotlin
// customize simple progressbar
vsl.progressbarView(
    progressStatus = true,
    progressBarColor = R.color.purple_700, // progressbar indicator color
    backgroundColor = R.color.white // progressbar view background color
)
//lottie progressbar
vsl.progressBarLottieView(
    progressStatus = true,
    lottieRes = R.raw.animation_loading, // your custom lottie res
    backgroundColor = R.color.white  // progressbar view background color
)
```

### Network Error View
```kotlin
vsl.networkErrorView(
    title = "Something went wrong",
    message = "Check your network connection",
    refreshCallback = {
        //handle callback
    }
)

// lottie networkErrorView
vsl.networkErrorLottieView(
    title = "Something went wrong",
    message = "Check your network connection",
    refreshCallback = {
        //handle callback
    }
)
```
### Customize Network Error View
```kotlin
vsl.networkErrorView(
    title = "Something went wrong",
    titleTextFontSize = 16.0f,
    message = "Check your network connection",
    messageTextFontSize = 16.0f,
    refreshButtonVisibility = true,
    buttonText = "Retry",
    buttonTextSize = 16.0f,
    buttonTextColor = R.color.white, // button text color
    buttonDrawable = R.drawable.viewstate_bg_orange_border_radius_30, // button background color
    buttonStartDrawable = R.drawable.ic_add,
    backgroundColor = R.color.white, // networkErrorView background color
    refreshCallback = {
        //handle callback
    }
)

// lottie networkErrorView
vsl.networkErrorLottieView(
    lottieRes = R.raw.animation_no_internet, // custom lottie resources
    title = "Something went wrong",
    titleTextFontSize = 16.0f,
    message = "Check your network connection",
    messageTextFontSize = 16.0f,
    refreshButtonVisibility = true,
    buttonText = "Retry",
    buttonTextSize = 16.0f,
    buttonTextColor = R.color.white, // button text color
    buttonDrawable = R.drawable.viewstate_bg_orange_border_radius_30, // button background color
    buttonStartDrawable = R.drawable.ic_add,
    backgroundColor = R.color.white, // networkErrorView background color
    refreshCallback = {
        //handle callback
    }
)
```

### Data Empty View
```kotlin
vsl.dataEmptyView(
    title = "Your Title",
    message = "Your Message",
    refreshCallback = {
        //handle callback
    }
)

// lottie dataEmptyView
vsl.dataEmptyLottieView(
    title = "Your Title",
    message = "Your Message",
    refreshCallback = {
        //handle callback
    }
)
```
### Customize Data Empty View
```kotlin
vsl.dataEmptyView(
    title = "Opps!",
    titleTextFontSize = 16.0f,
    message = "No Data found",
    messageTextFontSize = 16.0f,
    refreshButtonVisibility = true,
    buttonText = "Refresh",
    buttonTextSize = 16.0f,
    buttonTextColor = R.color.white, // button text color
    buttonDrawable = R.drawable.viewstate_bg_orange_border_radius_30, // button background color
    buttonStartDrawable = R.drawable.ic_add,
    backgroundColor = R.color.white, // networkErrorView background color
    refreshCallback = {
        //handle callback
    }
)

// lottie dataEmptyView
vsl.networkErrorLottieView(
    lottieRes = R.raw.animation_no_data, // custom lottie resources
    title = "Opps!",
    titleTextFontSize = 16.0f,
    message = "No Data found",
    messageTextFontSize = 16.0f,
    refreshButtonVisibility = true,
    buttonText = "Refresh",
    buttonTextSize = 16.0f,
    buttonTextColor = R.color.white, // button text color
    buttonDrawable = R.drawable.viewstate_bg_orange_border_radius_30, // button background color
    buttonStartDrawable = R.drawable.ic_add,
    backgroundColor = R.color.white, // networkErrorView background color
    refreshCallback = {
        //handle callback
    }
)
```

### Global Configuration
#### Configure it in your application class
```kotlin
VslConfig.networkErrorTitleText = ""
VslConfig.networkErrorTitleTextSize = 22.0f

VslConfig.networkErrorMessageText = ""
VslConfig.networkErrorMessageTextSize = 16.0f


VslConfig.networkErrorButtonDrawableRes = R.drawable.viewstate_bg_orange_border_radius_30
VslConfig.networkErrorButtonStartDrawableRes = null
VslConfig.networkErrorButtonTextColor = R.color.white
VslConfig.networkErrorImageDrawableRes = R.drawable.ic_view_state_no_internet
VslConfig.networkErrorLottieImageRawRes = R.raw.animation_no_internet


VslConfig.dataEmptyTitleText = ""
VslConfig.dataEmptyTitleTextSize = 22.0f

VslConfig.dataEmptyMessageText = ""
VslConfig.dataEmptyMessageTextSize = 16.0f


VslConfig.dataEmptyButtonBgDrawableRes = R.drawable.viewstate_bg_orange_border_radius_30
VslConfig.dataEmptyButtonTextColor = R.color.white


VslConfig.dataEmptyImageDrawableRes = R.drawable.ic_viewstae_no_result
VslConfig.dataEmptyLottieImageRawRes = R.raw.animation_no_data
VslConfig.progressBarColor = R.color.orange
VslConfig.progressBarLottie = R.raw.animation_loading

VslConfig.dataEmptyButtonText = "Refresh"
VslConfig.dataEmptyButtonTextSize = 16.0f

VslConfig.networkErrorButtonText = "Refresh"
VslConfig.networkErrorButtonTextSize = 16.0f

VslConfig.progressbarViewBackgroundResources = R.color.white
VslConfig.networkErrorViewBackgroundResources = R.color.white
VslConfig.dataEmptyViewBackgroundResources = R.color.white
```