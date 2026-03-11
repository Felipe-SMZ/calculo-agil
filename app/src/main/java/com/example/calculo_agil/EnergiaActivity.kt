package com.example.calculo_agil

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EnergiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_energia)

        val editVelocidade = findViewById<EditText>(R.id.editVelocidade)
        val editMassa = findViewById<EditText>(R.id.editMassa)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnCalcular.setOnClickListener {
            val velocidadeTexto = editVelocidade.text.toString()
            val massaTexto = editMassa.text.toString()

            if (velocidadeTexto.isEmpty() || massaTexto.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val velocidade = velocidadeTexto.toDouble()
            val massa = massaTexto.toDouble()

            if (massa <= 0) {
                Toast.makeText(this, "A massa não pode ser 0 ou negativa!", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            val e = (massa * velocidade * velocidade) / 2
            txtResultado.text = "Resultado: %.2f J".format(e)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}