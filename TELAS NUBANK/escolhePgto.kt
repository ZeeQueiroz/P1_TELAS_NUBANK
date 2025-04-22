package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class escolhePgto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_escolhe_pgto)

        val continuar : Button = findViewById(R.id.continuar)
        continuar.setOnClickListener {
            val intent = Intent(this, revisao::class.java)
            startActivity(intent)
        }
    }
}