package com.example.androidnativo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecepcaoDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recepcao_dados)

        val valorDigitado = intent.getStringExtra("Retorno")
        Toast.makeText(this,"Texto Enviado: $valorDigitado",
            Toast.LENGTH_LONG).show()
    }
}

