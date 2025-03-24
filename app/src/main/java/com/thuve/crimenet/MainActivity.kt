package com.thuve.crimenet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getting_start_0)

        findViewById<Button>(R.id.skip_btn).setOnClickListener {
            setContentView(R.layout.activity_getting_start_1)

            findViewById<Button>(R.id.skip_button).setOnClickListener {
                setContentView(R.layout.activity_getting_start_2)

                findViewById<Button>(R.id.getting_started_btn).setOnClickListener {
                    startActivity(Intent(this, LoginActivity::class.java))
                }
            }
        }
    }
}
