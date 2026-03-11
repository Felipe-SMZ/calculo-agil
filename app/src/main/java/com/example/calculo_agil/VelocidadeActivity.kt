package com.example.calculo_agil

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VelocidadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_velocidade)

        val editDistancia = findViewById<EditText>(R.id.editDistancia)
        val editTempo = findViewById<EditText>(R.id.editTempo)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnCalcular.setOnClickListener {
            val distanciaTexto = editDistancia.text.toString()
            val tempoTexto = editTempo.text.toString()

            if (distanciaTexto.isEmpty() || tempoTexto.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val distancia = distanciaTexto.toDouble()
            val tempo = tempoTexto.toDouble()

            if (tempo == 0.0) {
                Toast.makeText(this, "Tempo não pode ser zero!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val velocidade = distancia / tempo
            txtResultado.text = "Resultado: %.2f m/s".format(velocidade)

        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}