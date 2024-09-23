package com.eduardoagabes.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price)

        val btnIniciar = findViewById<Button>(R.id.btn_proximo)
        val edtPreco = findViewById<TextInputEditText>(R.id.edt_preco)

        btnIniciar.setOnClickListener {

            val precoStr: String = edtPreco.text.toString()

            if (precoStr == "") {
                Snackbar.make(
                    edtPreco,
                    "Preencha o campo vazío",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {

                val preco = precoStr.toFloat()

                val intent = Intent(this, ConsumptionActivity::class.java)
                intent.putExtra("preco", preco)
                startActivity(intent)
            }
        }
    }
}