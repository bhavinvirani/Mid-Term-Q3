package com.example.q3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val launchApp1Button: Button = findViewById(R.id.launchApp1Button)
        val launchApp2Button: Button = findViewById(R.id.launchApp2Button)

        launchApp1Button.setOnClickListener {
            // Intent to launch the first app
            val intent = Intent()
            intent.setClassName("com.example.q1", "com.example.q1.MainActivity")
            intent.putExtra("extraData", "Data from HubApp to App 1")
            startActivity(intent)
        }

        launchApp2Button.setOnClickListener {
            // Intent to launch the second app
            val intent = Intent()
            intent.setClassName("com.example.q2", "com.example.q2.MainActivity")
            intent.putExtra("extraData", "Data from HubApp to App 2")
            startActivity(intent)
        }
    }
}