package com.padc.kotlin.ftc.bottomnavigation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.padc.kotlin.ftc.bottomnavigation.fragments.HomeFragment
import com.padc.kotlin.ftc.bottomnavigation.fragments.NotificationFragment
import com.padc.kotlin.ftc.bottomnavigation.fragments.ProfileFragment

class BottomNavigationViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return HomeFragment()
            1 -> return NotificationFragment()
            2 -> return ProfileFragment()
        }
        return HomeFragment()
    }
}
