package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class revisao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_revisao)

        val enviaValida : Button = findViewById(R.id.enviaValida)
        enviaValida.setOnClickListener {
            val intent = Intent(this, senha::class.java)
            startActivity(intent)
        }
    }
}