package com.eduardoagabes.fuelcalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class ConsumptionActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumption)

        val btnNext_two = findViewById<Button>(R.id.btn_proximo_2)
        val edtConsumo = findViewById<TextInputEditText>(R.id.edt_consumo)

        val preco = intent.getFloatExtra("preco", 0f)

        val btnBack = findViewById<ImageButton>(R.id.btn_arrow_consumption)

        btnBack.setOnClickListener {
            finish()
        }

        btnNext_two.setOnClickListener {

            val consumoStr: String = edtConsumo.text.toString()

            if (consumoStr == "") {
                Snackbar.make(
                    edtConsumo,
                    "Preencha o campo vazío",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {

                val consumo = consumoStr.toFloat()

                val intent = Intent(this, DistanceActivity::class.java)
                intent.putExtra("preco", preco)
                intent.putExtra("consumo", consumo)
                startActivity(intent)
            }
        }
    }
}