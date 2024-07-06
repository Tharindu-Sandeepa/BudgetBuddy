package com.kotlin.budgetbuddy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class OnemonthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onemonth)


    }
    fun onCashin (view: View) {
        val intent = Intent(this, cashin::class.java)
        startActivity(intent)
    }
    fun onCashout (view: View) {
        val intent = Intent(this, cashout::class.java)
        startActivity(intent)
    }
    fun onClickLoginOrRegister(view: View) {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)

    }
    fun onTodashboard(view: View) {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)

    }


}
