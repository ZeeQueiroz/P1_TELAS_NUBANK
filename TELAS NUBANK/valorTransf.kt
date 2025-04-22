package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class valorTransf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_valor_transf)

        val botaoProsseguir : ImageButton = findViewById(R.id.botaoProsseguir)
        botaoProsseguir.setOnClickListener {
            val intent = Intent(this, transfContato::class.java)
            startActivity(intent)
        }
    }
}