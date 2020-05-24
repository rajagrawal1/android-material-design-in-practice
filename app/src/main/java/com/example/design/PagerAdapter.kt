package com.example.design

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val listOfTitles = arrayOf(R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3)

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                WidgetFragment.newInstance()
            }
            1 -> {
                ModalFragment.newInstance()
            }
            else -> {
                ShapesFragment.newInstance()
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