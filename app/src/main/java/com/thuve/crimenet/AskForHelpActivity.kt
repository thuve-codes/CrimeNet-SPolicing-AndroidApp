package com.thuve.crimenet

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class AskForHelpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ask_for_help)

        val backBtn: ImageView = findViewById(R.id.backbtn)
        val sosButton: TextView = findViewById(R.id.sos_button)

        backBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

//        sosButton.setOnClickListener {
//            showConfirmationDialog()
//        }
    }

    private fun showConfirmationDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Are you Sure?")
            .setMessage("Pressing SOS will alert nearby people and send your location. Use only in emergencies.")
            .setPositiveButton("YES") { _, _ ->

                setContentView(R.layout.activity_sos)

                val tvCancel: TextView = findViewById(R.id.tvCancel)

                tvCancel.setOnClickListener {
                    setContentView(R.layout.activity_home)
                }

                //startActivity(Intent(this, SosActivity::class.java))
            }
            .setNegativeButton("NO") { dialog, _ ->
                dialog.dismiss()
            }
        builder.create().show()
    }
}
