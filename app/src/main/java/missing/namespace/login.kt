package com.example.demo1


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.register)
        val loginbtn = findViewById<Button>(R.id.loginButton)
        loginbtn.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }
}