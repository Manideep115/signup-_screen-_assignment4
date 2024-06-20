package com.example.yourapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.signup_assignment4.R

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnSignup = findViewById(R.id.btnSignup)

        btnSignup.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("USERNAME", username)
                putExtra("PASSWORD", password)
            }
            startActivity(intent)
        }
    }
}
