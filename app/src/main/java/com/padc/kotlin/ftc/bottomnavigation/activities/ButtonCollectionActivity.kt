package com.padc.kotlin.ftc.bottomnavigation.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padc.kotlin.ftc.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_button_collection.*

class ButtonCollectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_collection)


        btnBottomNavigation.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnAppBar.setOnClickListener {
            val intent = Intent(this, AppBarBottomActivity::class.java)
            startActivity(intent)
        }

        btnBottomNavigationWithViewPager.setOnClickListener {
            val intent = Intent(this, BottomNavigationWithViewPager::class.java)
            startActivity(intent)
        }

        btnBottomSheet.setOnClickListener {
            val intent = Intent(this, BottomSheetActivity::class.java)
            startActivity(intent)
        }

        btnOtherUIElements.setOnClickListener {
            val intent = Intent(this, OtherCommonUIElementActivity::class.java)
            startActivity(intent)
        }

        btnCollapsingToolBar.setOnClickListener {
            val intent = Intent(this, CollapsingToolbarActivity::class.java)
            startActivity(intent)
        }

        btnCoordinator.setOnClickListener {
            val intent = Intent(this, CoordinatorActivity::class.java)
            startActivity(intent)
        }

        btnConstraint.setOnClickListener {
            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
        }

        btnNavigationView.setOnClickListener {
            val intent = Intent(this, NavigationViewActivity::class.java)
            startActivity(intent)
        }

    }
}