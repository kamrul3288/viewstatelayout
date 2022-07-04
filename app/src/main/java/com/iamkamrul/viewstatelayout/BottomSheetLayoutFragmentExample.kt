package com.iamkamrul.viewstatelayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.iamkamrul.viewstatelayout.databinding.FragmentBottomSheetLayoutExampleBinding


class BottomSheetLayoutFragmentExample : Fragment() {
    private val  binding by lazy {
        FragmentBottomSheetLayoutExampleBinding.inflate(layoutInflater)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        initView()
        return binding.root
    }

    private fun initView(){
        binding.showBottomSheetBtn.setOnClickListener {
            findNavController().navigate(BottomSheetLayoutFragmentExampleDirections.actionBottomSheetLayoutFragmentExampleToExampleBottomSheet())
        }
    }

}