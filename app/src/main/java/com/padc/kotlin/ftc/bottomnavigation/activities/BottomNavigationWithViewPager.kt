package com.padc.kotlin.ftc.bottomnavigation.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.padc.kotlin.ftc.bottomnavigation.R
import com.padc.kotlin.ftc.bottomnavigation.adapters.BottomNavigationViewPagerAdapter
import kotlinx.android.synthetic.main.activity_bottom_navigation_with_view_pager.*

class BottomNavigationWithViewPager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_with_view_pager)

        viewPager.adapter = BottomNavigationViewPagerAdapter(this)
        viewPager.currentItem = 0

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> bottomNav.selectedItemId = R.id.action_home
                    1 -> bottomNav.selectedItemId = R.id.action_notification
                    2 -> bottomNav.selectedItemId = R.id.action_profile
                }
            }
        })

        bottomNav.setOnItemSelectedListener { menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.action_home -> viewPager.currentItem = 0
                R.id.action_notification -> viewPager.currentItem = 1
                R.id.action_profile -> viewPager.currentItem = 2
            }
            true
        }

    }
}