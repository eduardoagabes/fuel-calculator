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

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnIniciar = findViewById<Button>(R.id.btn_proximo3)
        val edtDistancia = findViewById<TextInputEditText>(R.id.edt_distancia)


        btnIniciar.setOnClickListener {

            val distanciaStr: String = edtDistancia.text.toString()
            val distancia = edtDistancia.text

            if (distanciaStr == "") {
                Snackbar.make(
                    edtDistancia,
                    "Preencha o campo vazío",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {

                intent.putExtra("123", distancia)

                val intent = Intent(this, activity_result::class.java)
                startActivity(intent)
            }
        }
    }
}