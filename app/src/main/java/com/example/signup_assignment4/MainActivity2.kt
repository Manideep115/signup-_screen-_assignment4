package com.example.yourapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.signup_assignment4.R

class SecondActivity : AppCompatActivity() {

    private lateinit var tvUsername: TextView
    private lateinit var tvPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvUsername = findViewById(R.id.tvUsername)
        tvPassword = findViewById(R.id.tvPassword)

        val username = intent.getStringExtra("USERNAME")
        val password = intent.getStringExtra("PASSWORD")

        tvUsername.text = "Username: $username"
        tvPassword.text = "Password: $password"
    }
}
