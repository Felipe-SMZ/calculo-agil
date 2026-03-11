package com.example.calculo_agil

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ForcaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forca)

        val editMassa = findViewById<EditText>(R.id.editMassa)
        val editAceleracao = findViewById<EditText>(R.id.editAceleracao)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnCalcular.setOnClickListener {
            val massaTexto = editMassa.text.toString()
            val aceleracaoTexto = editAceleracao.text.toString()

            if (massaTexto.isEmpty() || aceleracaoTexto.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val massa = massaTexto.toDouble()
            val aceleracao = aceleracaoTexto.toDouble()

            if (aceleracao == 0.0) {
                Toast.makeText(this, "A aceleração não pode ser zero!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (massa <= 0.0) {
                Toast.makeText(this, "A massa não pode ser zero nem negativa!", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            val forca = massa * aceleracao
            txtResultado.text = "Resultado: %.2f N".format(forca)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}