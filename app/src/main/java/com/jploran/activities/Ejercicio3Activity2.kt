package com.jploran.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Ejercicio3Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio32)

        val name = intent.getStringExtra("Nombre")
        val lastName = intent.getStringExtra("Apellido")
        val age = intent.getIntExtra("Edad" , 0)
        val showInfo= findViewById<TextView>(R.id.showInfo)

        showInfo.text= "Parametros recibidos - Nombre: $name Apellido: $lastName Edad: $age"

        val btnFinish= findViewById<Button>(R.id.btnFinish)
        btnFinish.setOnClickListener {
            val resultIntent = Intent().apply {
                putExtra("EXTRA_VALID", true)
            }
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}