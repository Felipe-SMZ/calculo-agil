package com.example.calculo_agil

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AreaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area)

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

            if (0 >= A || 0 >= B || 0 >= C) {
                Toast.makeText(this, "Os valores tem que ser maiores que ZERO!", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            val area = A * B * C
            txtResultado.text = "%.2f m2".format(area)

        }


        btnBack.setOnClickListener {
            finish()
        }
    }
}