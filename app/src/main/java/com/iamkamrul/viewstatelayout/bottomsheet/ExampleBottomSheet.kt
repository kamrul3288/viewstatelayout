package com.iamkamrul.viewstatelayout.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.iamkamrul.viewstatelayout.databinding.FragmentExampleBottomSheetBinding


class ExampleBottomSheet : BottomSheetDialogFragment() {

    private val  binding by lazy {
        FragmentExampleBottomSheetBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.VL.setLottieProgressBarStatusLayout(true)
        return binding.root
    }

}