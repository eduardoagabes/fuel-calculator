package com.eduardoagabes.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btnIniciar = findViewById<Button>(R.id.btn_novo_calculo)

        val preco = intent.getStringExtra("123")?.toInt() ?: 0
        val consumo = intent.getStringExtra("123")?.toInt() ?: 0
        val distancia = intent.getStringExtra("123")?.toInt() ?: 0

        val result  = (distancia / consumo) * preco

        findViewById<TextView>(R.id.tv_preco)

        btnIniciar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}