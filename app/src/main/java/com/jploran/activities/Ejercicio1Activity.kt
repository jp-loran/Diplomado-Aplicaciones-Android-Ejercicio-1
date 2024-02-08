package com.jploran.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

/*
*Un activity la cual contenga implementado sus principales métodos
* del ciclo de vida, en los cuales contenga un componente “Toast”
* que muestre una cadena de texto correspondiente al estado en el
* que entró
* */

class Ejercicio1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)
        Toast.makeText(this, "Ciclo de vida: onCreate", Toast.LENGTH_SHORT ).show()

        val btnLink = findViewById<Button>(R.id.btnExercise2)
        val btnParameters = findViewById<Button>(R.id.btnExercise3)

        btnLink.setOnClickListener {
            val sendSomewhere = Intent(this, Ejercicio2Activity::class.java)
            startActivity(sendSomewhere)
        }

        btnParameters.setOnClickListener {
            val sendSomewhere = Intent(this, Ejercicio3Activity1::class.java)
            startActivity(sendSomewhere)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Ciclo de vida: onStart", Toast.LENGTH_SHORT ).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Ciclo de vida: onResume", Toast.LENGTH_SHORT ).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Ciclo de vida: onPause", Toast.LENGTH_SHORT ).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Ciclo de vida: onStop", Toast.LENGTH_SHORT ).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Ciclo de vida: onRestart", Toast.LENGTH_SHORT ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Ciclo de vida: onDestroy", Toast.LENGTH_SHORT ).show()
    }
}