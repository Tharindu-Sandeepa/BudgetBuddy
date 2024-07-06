package com.kotlin.budgetbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {

    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //delay
        handler.postDelayed({
            onClickLogo(findViewById(R.id.logoImageView))
        }, 4000)
    }

    fun onClickLogo(view: View) {
        val intent = Intent(this, Onb1Activity::class.java)
        startActivity(intent)
    }

    override fun onDestroy() {

        handler.removeCallbacksAndMessages(null)
        super.onDestroy()
    }
}
