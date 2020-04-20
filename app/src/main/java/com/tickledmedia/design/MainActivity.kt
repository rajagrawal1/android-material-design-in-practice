package com.tickledmedia.design

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewPager()

        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    private fun setupViewPager() {
        val pagerAdapter =
            PagerAdapter(this, supportFragmentManager)

        val viewPager: ViewPager = findViewById(R.id.view_pager)

        viewPager.adapter = pagerAdapter

        val tabs: TabLayout = findViewById(R.id.tabs)

        tabs.setupWithViewPager(viewPager)
    }
}