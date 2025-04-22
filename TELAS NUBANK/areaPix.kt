package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class areaPix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area_pix)

        val botaoTransferir : ImageButton = findViewById(R.id.botaoTransferir)
        botaoTransferir.setOnClickListener {
            val intent = Intent(this, valorTransf::class.java)
            startActivity(intent)
        }
    }
}