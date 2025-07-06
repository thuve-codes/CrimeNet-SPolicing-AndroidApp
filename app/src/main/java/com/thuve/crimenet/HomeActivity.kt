package com.thuve.crimenet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Report a Crime
        findViewById<View>(R.id.Reportcrime).setOnClickListener {
            startActivity(Intent(this, ReportCrimeActivity::class.java))
        }

        // Ask for Help
//        findViewById<View>(R.id.askforhelp).setOnClickListener {
//            startActivity(Intent(this, AskForHelpActivity::class.java))
//        }

        // Uncomment and implement when other activities are ready

        /*
        // User Profile Icon
        findViewById<ImageView>(R.id.profileIcon).setOnClickListener {
            startActivity(Intent(this, UserProfileActivity::class.java))
        }

        // Track Reports
        findViewById<Button>(R.id.btnTrackReports).setOnClickListener {
            startActivity(Intent(this, TrackReportsActivity::class.java))
        }

        // Live Alerts
        findViewById<Button>(R.id.btnLiveAlerts).setOnClickListener {
            startActivity(Intent(this, LiveAlertsActivity::class.java))
        }

        // Crime Map
        findViewById<Button>(R.id.btnCrimeMap).setOnClickListener {
            startActivity(Intent(this, CrimeMapActivity::class.java))
        }
        */
    }
}
