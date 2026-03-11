package com.example.calculo_agil

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TemperaturaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_temperatura)

        //        4°) Faça um app que peça a temperatura em graus Fahrenheit, transforme e mostre a
        //        temperatura em graus Celsius.  C = (5 * (F-32) / 9).
        //        5°) Faça um app que peça a temperatura em graus Celsius, transforme e mostre em graus
        //        Fahrenheit. F = (9 * C + 160) / 5

        val editGraus = findViewById<EditText>(R.id.editGraus)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val switchUnidade = findViewById<Switch>(R.id.switchUnidade)

        switchUnidade.setOnClickListener {
            if (switchUnidade.isChecked) {
                val C = editGraus.text.toString().toDouble()
                val conversao = (9 * C + 160) / 5
                txtResultado.text = "%.2f F".format(conversao)
            } else {
                val F = editGraus.text.toString().toDouble()
                val conversao = (5 * (F - 32) / 9)
                txtResultado.text = "%.2f C".format(conversao)
            }
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
