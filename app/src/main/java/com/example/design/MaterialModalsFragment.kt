package com.example.design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_modals.view.*

class MaterialModalsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_modals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.button_bottom_sheet.setOnClickListener {
            MaterialBottomSheetFragment()
                .show(requireFragmentManager(), MaterialBottomSheetFragment.FRAGMENT_TAG)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(): MaterialModalsFragment {
            return MaterialModalsFragment()
        }
    }
}