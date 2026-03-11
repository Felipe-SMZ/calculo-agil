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

class DiluicaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diluicao)

        val editC1 = findViewById<EditText>(R.id.editC1)
        val editC2 = findViewById<EditText>(R.id.editC2)
        val editV1 = findViewById<EditText>(R.id.editV1)
        val editV2 = findViewById<EditText>(R.id.editV2)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val btnBack = findViewById<Button>(R.id.btnBack)


        btnCalcular.setOnClickListener {
            val c1Texto = editC1.text.toString()
            val c2Texto = editC2.text.toString()
            val v1Texto = editV1.text.toString()
            val v2Texto = editV2.text.toString()

            val vazios = listOf(c1Texto, c2Texto, v1Texto, v2Texto).count { it.isEmpty() }

            if (vazios != 1) {
                Toast.makeText(
                    this,
                    "Deixe exatamente UM campo vazio para calcular!",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            // C1 * V1 = C2 * V2

            if (c1Texto.isEmpty()) {
                val c2 = c2Texto.toDouble()
                val v1 = v1Texto.toDouble()
                val v2 = v2Texto.toDouble()
                if (c2 <= 0 || v1 <= 0 || v2 <= 0) {
                    Toast.makeText(
                        this,
                        "Os valores têm que ser maiores que ZERO!",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
                txtResultado.text = "C1 = %.2f g/L".format((c2 * v2) / v1)
            }

            if (c2Texto.isEmpty()) {
                val c1 = c1Texto.toDouble()
                val v1 = v1Texto.toDouble()
                val v2 = v2Texto.toDouble()
                if (c1 <= 0 || v1 <= 0 || v2 <= 0) {
                    Toast.makeText(
                        this,
                        "Os valores têm que ser maiores que ZERO!",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
                txtResultado.text = "C2 = %.2f g/L".format((c1 * v1) / v2)
            }

            if (v1Texto.isEmpty()) {
                val c1 = c1Texto.toDouble()
                val c2 = c2Texto.toDouble()
                val v2 = v2Texto.toDouble()
                if (c1 <= 0 || c2 <= 0 || v2 <= 0) {
                    Toast.makeText(
                        this,
                        "Os valores têm que ser maiores que ZERO!",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
                txtResultado.text = "V1 = %.2f mL".format((c2 * v2) / c1)
            }

            if (v2Texto.isEmpty()) {
                val c1 = c1Texto.toDouble()
                val c2 = c2Texto.toDouble()
                val v1 = v1Texto.toDouble()
                if (c1 <= 0 || c2 <= 0 || v1 <= 0) {
                    Toast.makeText(
                        this,
                        "Os valores têm que ser maiores que ZERO!",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
                txtResultado.text = "V2 = %.2f mL".format((c1 * v1) / c2)
            }
        }


        btnBack.setOnClickListener {
            finish()
        }
    }
}