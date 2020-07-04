package com.example.design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.design.databinding.FragmentMaterialModalsBinding

class MaterialModalsFragment : Fragment() {

    private lateinit var mBinding: FragmentMaterialModalsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMaterialModalsBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.buttonBottomSheet.setOnClickListener {
            MaterialBottomSheetFragment.newInstance().show(requireFragmentManager(), MaterialBottomSheetFragment.FRAGMENT_TAG)
        }

        mBinding.buttonBottomSheetRounded.setOnClickListener {
            MaterialRoundedBottomSheetFragment.newInstance().show(requireFragmentManager(), MaterialRoundedBottomSheetFragment.FRAGMENT_TAG)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(): MaterialModalsFragment {
            return MaterialModalsFragment()
        }
    }
}