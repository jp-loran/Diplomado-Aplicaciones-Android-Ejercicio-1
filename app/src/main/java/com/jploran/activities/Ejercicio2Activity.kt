package com.jploran.activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ejercicio2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        val btnLink = findViewById<Button>(R.id.btnLink)

        btnLink.setOnClickListener {
            val sendSomewhere = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"))
            startActivity(sendSomewhere)
        }
    }
}