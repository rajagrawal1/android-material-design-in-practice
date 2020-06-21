package com.example.design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.design.databinding.FragmentMaterialButtonsDemoBinding

class MaterialButtonsDemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentMaterialButtonsDemoBinding.inflate(layoutInflater, container, false).root
    }

    companion object {

        @JvmStatic
        fun newInstance(): MaterialButtonsDemoFragment {
            return MaterialButtonsDemoFragment()
        }
    }
}