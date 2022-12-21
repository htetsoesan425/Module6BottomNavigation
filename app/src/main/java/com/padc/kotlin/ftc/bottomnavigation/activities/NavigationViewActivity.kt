package com.padc.kotlin.ftc.bottomnavigation.activities

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.padc.kotlin.ftc.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_navigation_view.*

class NavigationViewActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_view)

        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.drawer_open,
            R.string.drawer_close
        )

        toggle.syncState()

        navigationView.setNavigationItemSelectedListener(this)

        btnEndRefresh.setOnClickListener {
            swlMain.isRefreshing = false
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_camera -> {
                Toast.makeText(this, "This is camera menu", Toast.LENGTH_SHORT).show()
                drawerLayout.closeDrawer(GravityCompat.START)
            }

            R.id.action_gallery -> {
                Toast.makeText(this, "This is gallery menu", Toast.LENGTH_SHORT).show()
                drawerLayout.closeDrawer(GravityCompat.START)
            }
            R.id.action_setting -> {
                Toast.makeText(this, "This is setting menu", Toast.LENGTH_SHORT).show()
                drawerLayout.closeDrawer(GravityCompat.START)
            }
            R.id.action_slide_show -> {
                Toast.makeText(this, "This is slide show menu", Toast.LENGTH_SHORT).show()
                drawerLayout.closeDrawer(GravityCompat.START)
            }
            R.id.action_send -> {
                Toast.makeText(this, "This is send menu", Toast.LENGTH_SHORT).show()
                drawerLayout.closeDrawer(GravityCompat.START)
            }
            R.id.action_share -> {
                Toast.makeText(this, "This is share menu", Toast.LENGTH_SHORT).show()
                drawerLayout.closeDrawer(GravityCompat.START)
            }
        }
        return true
    }

    override fun onBackPressed() {
        when {
            drawerLayout.isDrawerOpen(GravityCompat.START) -> drawerLayout.closeDrawer(GravityCompat.START)
            else ->
                super.onBackPressed()
        }
    }
}