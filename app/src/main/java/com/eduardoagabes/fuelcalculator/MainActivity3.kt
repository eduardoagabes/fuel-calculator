package com.eduardoagabes.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnIniciar = findViewById<Button>(R.id.btn_proximo2)
        val edtConsumo = findViewById<TextInputEditText>(R.id.edt_consumo)

        val preco = intent.getBundleExtra("123")

        btnIniciar.setOnClickListener {

            val consumo = edtConsumo.text
            val consumoStr: String = edtConsumo.text.toString()

            if (consumoStr == "") {
                Snackbar.make(
                    edtConsumo,
                    "Preencha o campo vazío",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {

                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("123", preco)
                intent.putExtra("123", consumo)
                startActivity(intent)
            }
        }
    }
}