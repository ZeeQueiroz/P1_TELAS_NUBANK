package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class transfContato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transf_contato)

        val escolhido : ImageButton = findViewById(R.id.escolhido)
        escolhido.setOnClickListener {
            val intent = Intent(this, dadosTransf::class.java)
            startActivity(intent)
        }
    }
}