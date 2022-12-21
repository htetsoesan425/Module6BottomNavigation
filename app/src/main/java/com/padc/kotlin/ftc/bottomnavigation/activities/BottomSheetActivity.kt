package com.padc.kotlin.ftc.bottomnavigation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.padc.kotlin.ftc.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_bottom_sheet.*

class BottomSheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        val sheet = BottomSheetBehavior.from(bottomSheet)

        btnShow.setOnClickListener {
            when {
                sheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                    sheet.state = BottomSheetBehavior.STATE_EXPANDED
                }
                else -> {
                    sheet.state = BottomSheetBehavior.STATE_COLLAPSED

                }
            }
        }
    }
}