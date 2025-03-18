package com.example.androidnativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EnvioDados : AppCompatActivity() {
    lateinit var campoTexto : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_envio_dados)

        val botaoEnviar : Button = findViewById(R.id.botaoEnviar)
        botaoEnviar.setOnClickListener{
            campoTexto = findViewById(R.id.campoTexto)
            val intent = Intent(this,RecepcaoDados::class.java)
            intent.putExtra("Retorno",campoTexto.text.toString())
            startActivity(intent)
        }
    }
}