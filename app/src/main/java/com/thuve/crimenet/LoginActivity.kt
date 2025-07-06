package com.thuve.crimenet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        findViewById<TextView>(R.id.signupText).setOnClickListener {
//            startActivity(Intent(this, SignupActivity::class.java))
//        }

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
