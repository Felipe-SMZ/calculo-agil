package com.example.calculo_agil

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class EquacaodeTorricelliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equacaode_torricelli)

        val editA = findViewById<EditText>(R.id.editC1)
        val editB = findViewById<EditText>(R.id.editC2)
        val editC = findViewById<EditText>(R.id.editV1)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnCalcular.setOnClickListener {
            val Atexto = editA.text.toString()
            val Btexto = editB.text.toString()
            val Ctexto = editC.text.toString()

            if (Atexto.isEmpty() || Btexto.isEmpty() || Ctexto.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val A = Atexto.toDouble()
            val B = Btexto.toDouble()
            val C = Ctexto.toDouble()


            val conta = (A.pow(2) + (2 * B * C))

            if (conta < 0) {
                Toast.makeText(this, "Parou antes de percorrer a distância!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val velocidade = Math.sqrt(conta)
            txtResultado.text = "%.2f m/s".format(velocidade)

        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}