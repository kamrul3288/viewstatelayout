# ViewStateLayout
Easy way to manage common state templates like loading, empty, error etc.!
### [Full Documentation](doc)
![](https://media.giphy.com/media/fi9ukg7uqeO5WZETTc/giphy.gif)
### Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
  repositories {
    maven {url 'https://jitpack.io'}
  }
}
```
### Step 2. Add the dependency
```gradle
dependencies {
  implementation "com.github.kamrul3288:viewstatelayout:1.1.1"
}
```

### Step 3.Just wrap a view which target area(view) to show states.
```xml
<com.iamkamrul.vsl.ConstraintLayout
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintBottom_toBottomOf="parent"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
        
       <androidx.recyclerview.widget.RecyclerView
          app:layout_constraintEnd_toEndOf="parent"
          app:layout_constraintStart_toStartOf="parent"
          app:layout_constraintBottom_toBottomOf="parent"
          app:layout_constraintTop_toTopOf="parent"
          android:id="@+id/listRv"
          android:layout_width="0dp"
          android:layout_height="0dp"/>
        
        
 </com.iamkamrul.vsl.ConstraintLayout>
```

### Finally in your activity/fragment get reference and call the methods
### Progressbar
```kotlin
binding.root.progressbarView(true)
binding.root.progressBarLottieView(true)
```
### Network Error
```kotlin
binding.root.networkErrorView(  //also you can call networkErrorLottieView
    title = "Something went wrong",
    message = "Check your network connection",
    refreshCallback = {
        //call your api again to refresh
    }
)
```
### Data Empty
```kotlin
 binding.root.dataEmptyView(
    title = "Lorem Ipsum",
    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
    refreshCallback = {
        // refresh your data source again
    }
)
```
### Global Config
```kotlin
VslConfig.progressBarColor = R.color.purple_700
VslConfig.networkErrorButtonDrawableRes = R.drawable.exaple_vsl_button_bg
VslConfig.networkErrorButtonTextColor = R.color.black
VslConfig.dataEmptyButtonBgDrawableRes = R.drawable.exaple_vsl_button_bg
VslConfig.dataEmptyButtonTextColor = R.color.black
VslConfig.networkErrorButtonStartDrawableRes = R.drawable.ic_add
//and may more
```



License
-------
Copyright 2022 Kamrul Hasan
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
