package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dadosTransf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dados_transf)

        val escolha : Button = findViewById(R.id.escolha)
        escolha.setOnClickListener {
            val intent = Intent(this, escolhePgto::class.java)
            startActivity(intent)
        }
    }
}