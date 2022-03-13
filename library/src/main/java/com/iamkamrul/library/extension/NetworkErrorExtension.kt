package com.iamkamrul.library.extension

import androidx.core.view.isVisible
import com.iamkamrul.library.databinding.ViewStateConstraintLayoutBinding


fun ViewStateConstraintLayoutBinding.hideNetworkErrorLayout(){
    incSimpleErrorLayout.simpleErrorLayout.isVisible = false
}