package com.kotlin.budgetbuddy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class cashout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.out)
    }

    fun onMonthClick (view: View) {
        val intent = Intent(this, OnemonthActivity::class.java)
        startActivity(intent)
    }
    fun onTodashboard(view: View) {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)

    }
}