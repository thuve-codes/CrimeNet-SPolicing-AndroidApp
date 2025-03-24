package com.thuve.crimenet

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class UserProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val backBtn: ImageView = findViewById(R.id.backbtn)
        backBtn.setOnClickListener {
            finish()
        }
    }
}
