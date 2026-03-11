package com.example.calculo_agil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)

        btn1.setOnClickListener {
            val intent = Intent(this, VelocidadeActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, ForcaActivity::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, EnergiaActivity::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this, TemperaturaActivity::class.java)
            startActivity(intent)
        }
//
//        btn5.setOnClickListener {
//            val intent = Intent(this, VelocidadeActivity::class.java)
//            startActivity(intent)
//        }
//
//        btn6.setOnClickListener {
//            val intent = Intent(this, ForcaActivity::class.java)
//            startActivity(intent)
//        }
//
        btn7.setOnClickListener {
            val intent = Intent(this, AreaActivity::class.java)
            startActivity(intent)
        }

    }
}