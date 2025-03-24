package com.thuve.crimenet

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class SosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sos)

        val tvCancel: TextView = findViewById(R.id.tvCancel)

        tvCancel.setOnClickListener {
            setContentView(R.layout.activity_home)
        }
    }
}
