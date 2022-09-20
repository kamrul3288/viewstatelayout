package com.iamkamrul.viewstatelayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.iamkamrul.viewstatelayout.databinding.FragmentViewStateLayoutExampleBinding


class ViewStateLayoutExampleFragment : Fragment() {

    private val  binding by lazy {
        FragmentViewStateLayoutExampleBinding.inflate(layoutInflater)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View{
        initializeView()
        return binding.root
    }

    private fun initializeView(){
        binding.bottomSheetBtn.setOnClickListener {
            findNavController().navigate(ViewStateLayoutExampleFragmentDirections.actionViewStateLayoutExampleFragmentToBottomSheetLayoutFragmentExample())
        }

        binding.progressBtn.elevation = 0f

        binding.progressBtn.setOnClickListener {
            binding.viewState.setSimpleProgressBarStatusLayout(true)
        }

        binding.networkError.setOnClickListener {
            binding.viewState.showSimpleNetworkErrorLayout(
                title = "Something went wrong",
                message = "Check your network connection",
                buttonStartDrawable = R.drawable.ic_refresh_24
            ) {
                Toast.makeText(requireContext(), "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

        binding.dataEmptyBtn.setOnClickListener {
            binding.viewState.showSimpleDataEmptyLayout(
                title = "Lorem Ipsum",
                message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            ) {
                Toast.makeText(requireContext(), "data refresh Call", Toast.LENGTH_SHORT).show()
            }

        }

        binding.lottieProgressBtn.setOnClickListener {
            binding.viewState.setLottieProgressBarStatusLayout(true)
        }

        binding.lottieNetworkError.setOnClickListener {
            binding.viewState.showLottieNetworkErrorLayout(
                title = "Something went wrong",
                message = "Check your network connection"
            ) {
                Toast.makeText(requireContext(), "refresh Call", Toast.LENGTH_SHORT).show()
            }
        }

        binding.lottieDataEmptyBtn.setOnClickListener {
            binding.viewState.showLottieDataEmptyLayout(
                title = "Lorem Ipsum",
                message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            ) {
                Toast.makeText(requireContext(), "data refresh Call", Toast.LENGTH_SHORT).show()
            }

        }
    }

}