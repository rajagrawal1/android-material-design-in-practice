package com.example.design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.design.databinding.FragmentMaterialCardsDemoBinding

class MaterialCardsDemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentMaterialCardsDemoBinding.inflate(layoutInflater, container, false).root
    }

    companion object {

        @JvmStatic
        fun newInstance(): MaterialCardsDemoFragment {
            return MaterialCardsDemoFragment()
        }
    }
}