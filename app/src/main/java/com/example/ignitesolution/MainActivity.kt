package com.example.ignitesolution

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set XML layout as content view

        val troubleshootingButton: Button = findViewById(R.id.btnTroubleshoot)
        troubleshootingButton.setOnClickListener {
            // Start the troubleshoot activity when the button is clicked
            val intent = Intent(this, TroubleshootingActivity::class.java)
            startActivity(intent)
        }
    }
}