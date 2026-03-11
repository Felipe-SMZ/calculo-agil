package com.example.calculo_agil

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaResposta : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "EXTRA_NAME"
        const val EXTRA_PHONE = "EXTRA_PHONE"
        const val EXTRA_EMAIL = "EXTRA_EMAIL"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_resposta)

        var txtResposta = findViewById<TextView>(R.id.txtResposta)
        var btnMostrar = findViewById<Button>(R.id.btnMostrar)
        var btnBack = findViewById<Button>(R.id.btnBack)

        val extras = intent.extras
        val name = extras?.getString(EXTRA_NAME).orEmpty()
        val phone = extras?.getString(EXTRA_PHONE).orEmpty()
        val email = extras?.getString(EXTRA_EMAIL).orEmpty()

        txtResposta.text = "Nome: $name \nEmail: $email \nTelefone: $phone"
        btnMostrar.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Dados informados")
                .setMessage("Nome: $name \nEmail: $email \nTelefone: $phone")
                .setPositiveButton("OK", null)
                .show()
        }

        btnBack.setOnClickListener {
            finish()
        }

    }
}