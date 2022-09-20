# ViewStateLayout
[![](https://jitpack.io/v/kamrul3288/ViewStateLayout.svg)](https://jitpack.io/#kamrul3288/ViewStateLayout)

Easy way to manage common state templates like loading, empty, error etc.!

# How to
Step 1. Add the JitPack repository to your build file
----------------------------------------------------
```
allprojects {
  repositories {
    maven {url 'https://jitpack.io'}
  }
}
```
Step 2. Add the dependency
--------------------------
```
dependencies {
  implementation 'com.github.kamrul3288:ViewStateLayout:1.0.6'
}
```

Usage
-----
Then wrap a view which target area(view) to show states.
```xml
<com.iamkamrul.library.ViewStateConstraintLayout
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
        
        
 </com.iamkamrul.library.ViewStateConstraintLayout>
```

Finally in your activity/fragment get reference and call showXXX methods
```kotlin
binding.root.setSimpleProgressBarStatus(true)
binding.root.showSimpleNetworkError {
  // refresh button call
}
```
# API(Also support lottie animation) and customization
```kotlin
fun setSimpleProgressBarStatus(status:Boolean, progressBarColor:Int = R.color.orange)
```
```kotlin
fun showSimpleNetworkError(
errorImage:Int = R.drawable.ic_no_internet,
title:String = context.getString(R.string.title_no_internet),
message:String = context.getString(R.string.message_no_internet),
buttonText:String = context.getString(R.string.button_refresh),
buttonDrawable:Int = R.drawable.bg_orange_border_radius_30,
buttonTextColor:Int = R.color.white,
refreshCallback:()->Unit
)
```
```kotlin
fun hideSimpleNetworkError()
```
```kotlin
fun showSimpleDataEmptyView(
emptyImage:Int = R.drawable.ic_no_result,
message:String = context.getString(R.string.message_no_data_found),
buttonText:String = context.getString(R.string.button_refresh),
buttonDrawable:Int = R.drawable.bg_orange_border_radius_30,
buttonTextColor:Int = R.color.white,
refreshCallback:()->Unit
)
```
```kotlin
fun hideSimpleDataEmptyView()
```

<img src="https://user-images.githubusercontent.com/27208120/157304915-e0c2584d-2037-45c0-ac54-23f70e02901a.png" width=300 />  <img src="https://user-images.githubusercontent.com/27208120/157304569-ea6ec69c-f565-453b-8125-09433fa48fa7.png" width=300 />     <img src="https://user-images.githubusercontent.com/27208120/157305301-7b2ab3fc-bf63-47ae-b365-7daa160210ab.png" width=300 />


License
-------
Copyright 2022 Kamrul Hasan
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
