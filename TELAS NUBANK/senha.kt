package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class senha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_senha)

        val digit1 = findViewById<EditText>(R.id.digit1)
        val digit2 = findViewById<EditText>(R.id.digit2)
        val digit3 = findViewById<EditText>(R.id.digit3)
        val digit4 = findViewById<EditText>(R.id.digit4)
        val btnTransferir = findViewById<Button>(R.id.btnTransferir)

        btnTransferir.setOnClickListener {
            val senhaDigitada = digit1.text.toString() + digit2.text.toString() +
                    digit3.text.toString() + digit4.text.toString()

            val senhaCorreta = "1234"

            if (senhaDigitada == senhaCorreta) {
                val intent = Intent(this, transfRealizada::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Senha incorreta!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}