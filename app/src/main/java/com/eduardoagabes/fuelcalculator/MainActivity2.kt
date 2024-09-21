package com.eduardoagabes.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnIniciar = findViewById<Button>(R.id.btn_proximo)
        val edtPreco = findViewById<TextInputEditText>(R.id.edt_preco)

        btnIniciar.setOnClickListener {

            val precoStr: String = edtPreco.text.toString()
            val preco = edtPreco.text

            if (precoStr == "") {
                Snackbar.make(
                    edtPreco,
                    "Preencha o campo vazío",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {

                intent.putExtra("123", preco)
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
        }
    }
}