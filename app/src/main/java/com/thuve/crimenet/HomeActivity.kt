package com.thuve.crimenet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<ImageView>(R.id.profileIcon).setOnClickListener {
            startActivity(Intent(this, UserProfileActivity::class.java))
        }

        findViewById<Button>(R.id.btnReportCrime).setOnClickListener {
            startActivity(Intent(this, ReportCrimeActivity::class.java))
        }

        findViewById<Button>(R.id.btnAskForHelp).setOnClickListener {
            startActivity(Intent(this, AskForHelpActivity::class.java))
        }

        findViewById<Button>(R.id.btnTrackReports).setOnClickListener {
            startActivity(Intent(this, TrackReportsActivity::class.java))
        }

        findViewById<Button>(R.id.btnLiveAlerts).setOnClickListener {
            startActivity(Intent(this, LiveAlertsActivity::class.java))
        }

        findViewById<Button>(R.id.btnCrimeMap).setOnClickListener {
            startActivity(Intent(this, CrimeMapActivity::class.java))
        }
    }
}
