package com.example.design

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val listOfTitles =
        arrayOf(
            R.string.tab_typography,
            R.string.tab_buttons,
            R.string.tab_text_input,
            R.string.tab_cards,
            R.string.tab_modals,
            R.string.tab_misc
        )

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                MaterialTypographyFragment.newInstance()
            }
            1 -> {
                MaterialButtonsDemoFragment.newInstance()
            }
            2 -> {
                MaterialTextInputDemoFragment.newInstance()
            }
            3 -> {
                MaterialCardsDemoFragment.newInstance()
            }
            4 -> {
                MaterialModalsFragment.newInstance()
            }
            5 -> {
                MaterialMiscWidgetsFragment.newInstance()
            }
            else -> {
                MaterialTypographyFragment.newInstance()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(listOfTitles[position])
    }

    override fun getCount(): Int {
        return listOfTitles.size
    }
}