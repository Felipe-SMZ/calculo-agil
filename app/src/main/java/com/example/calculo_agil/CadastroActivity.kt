package com.example.calculo_agil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro)

        val editName = findViewById<EditText>(R.id.editName)
        val editPhone = findViewById<EditText>(R.id.editPhone)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnClean = findViewById<Button>(R.id.btnClean)

        btnCadastrar.setOnClickListener {
            var name = editName.text.toString()
            var phone = editPhone.text.toString()
            var email = editEmail.text.toString()
            val bundle = Bundle().apply {
                putString(TelaResposta.EXTRA_NAME, name)
                putString(TelaResposta.EXTRA_PHONE, phone)
                putString(TelaResposta.EXTRA_EMAIL, email)
            }

            val intent = Intent(this, TelaResposta::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }

        btnClean.setOnClickListener {
            editName.text?.clear()
            editPhone.text?.clear()
            editEmail.text?.clear()
        }


    }
}