package com.padc.kotlin.ftc.bottomnavigation.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.padc.kotlin.ftc.bottomnavigation.R
import com.padc.kotlin.ftc.bottomnavigation.fragments.HomeFragment
import com.padc.kotlin.ftc.bottomnavigation.fragments.NotificationFragment
import com.padc.kotlin.ftc.bottomnavigation.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchFragment(HomeFragment())

        bottomNav.setOnItemSelectedListener { menuItem: MenuItem ->

            when (menuItem.itemId) {
                R.id.action_home -> {
                    switchFragment(HomeFragment())
                }
                R.id.action_notification -> switchFragment(NotificationFragment())
                R.id.action_profile -> switchFragment(ProfileFragment())
            }
            false
        }


    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.flContainer, fragment)
            .commit()
    }
}