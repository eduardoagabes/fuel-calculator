package com.eduardoagabes.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class DistanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distance)

        val nextThree = findViewById<Button>(R.id.btn_proximo_3)
        val edtDistancia = findViewById<TextInputEditText>(R.id.edt_distancia)

        val consumo = intent.getFloatExtra("consumo", 0f)
        val preco = intent.getFloatExtra("preco", 0f)

        val btnBack = findViewById<ImageButton>(R.id.btn_arrow_distance)

        btnBack.setOnClickListener {
            finish()
        }

        nextThree.setOnClickListener {

            val distanciaStr: String = edtDistancia.text.toString()

            if (distanciaStr == "") {
                Snackbar.make(
                    edtDistancia,
                    "Preencha o campo vazío",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {

                val distancia = distanciaStr.toFloat()

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("distancia", distancia)
                intent.putExtra("consumo", consumo)
                intent.putExtra("preco", preco)

                startActivity(intent)
            }
        }
    }
}