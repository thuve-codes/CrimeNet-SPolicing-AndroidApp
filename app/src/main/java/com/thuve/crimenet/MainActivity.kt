package com.thuve.crimenet

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.getting_start_0)
        val btnsk1: Button = findViewById(R.id.skip_btn)
        btnsk1.setOnClickListener {
            setContentView(R.layout.getting_start_1)
            val btnsk2: Button = findViewById(R.id.skip_button)
            btnsk2.setOnClickListener {
                setContentView(R.layout.getting_start_2)
            }
        }
    }
}