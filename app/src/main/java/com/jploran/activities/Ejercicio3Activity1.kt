package com.jploran.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class Ejercicio3Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        val btSendExtra = findViewById<Button>(R.id.btnSendParameters)
        btSendExtra.setOnClickListener {
            val sendIntent = Intent(this, Ejercicio3Activity2::class.java).apply{
                putExtra("Nombre", "Juan")
                putExtra("Apellido", "Alvarez")
                putExtra("Edad", 24)
            }

            //startActivity(sendIntent)
            resultRegister.launch(sendIntent)
        }
    }

    private val resultRegister = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result -> if(result.resultCode == RESULT_OK){
            Toast.makeText(this, "Actividad terminada exitosamente", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "CANCELLED", Toast.LENGTH_SHORT).show()
        }
    }
}