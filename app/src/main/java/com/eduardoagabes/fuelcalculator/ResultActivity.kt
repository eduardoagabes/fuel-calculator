package com.eduardoagabes.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btnIniciar = findViewById<Button>(R.id.btn_novo_calculo)

        val distancia = intent.getFloatExtra("distancia", 0f)
        val consumo = intent.getFloatExtra("consumo", 0f)
        val preco = intent.getFloatExtra("preco", 0f)

        val result = (distancia / consumo) * preco

        val tvPreco = findViewById<TextView>(R.id.tv_preco)
        val tvConsumo = findViewById<TextView>(R.id.tv_consumo)
        val tvDistancia = findViewById<TextView>(R.id.tv_distancia)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        tvPreco.text = preco.toString()
        tvConsumo.text = consumo.toString()
        tvDistancia.text = distancia.toString()

        val resultFormatado = String.format("%.2f", result)
        tvResult.text = "$$resultFormatado"



        btnIniciar.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}