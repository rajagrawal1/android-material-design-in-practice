package com.example.design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_modals.view.*

class ShapesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shapes, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(): ShapesFragment {
            return ShapesFragment()
        }
    }
}