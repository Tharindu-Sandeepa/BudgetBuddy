package com.kotlin.budgetbuddy



import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
    }

    fun onMonthClick(view: View) {
        val intent = Intent(this, OnemonthActivity::class.java)
        startActivity(intent)
    }
    fun onAddmonth(view: View) {
        val intent = Intent(this, addmonth::class.java)
        startActivity(intent)
    }
}

