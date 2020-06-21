package com.example.design

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.design.databinding.FragmentMaterialTextInputDemoBinding
import kotlinx.android.synthetic.main.fragment_material_text_input_demo.*

class MaterialTextInputDemoFragment : Fragment() {

    private lateinit var mBinding: FragmentMaterialTextInputDemoBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMaterialTextInputDemoBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding.apply {
            inputThree.addOnEndIconChangedListener { textInputLayout, previousIcon ->

            }

            inputPassword.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                    input_three.error = null
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }
            })
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(): MaterialTextInputDemoFragment {
            return MaterialTextInputDemoFragment()
        }
    }
}