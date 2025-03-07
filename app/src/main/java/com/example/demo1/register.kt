package com.example.demo1


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.register)
        val regbtn = findViewById<Button>(R.id.btnRegister)
        regbtn.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }
}