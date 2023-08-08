package com.example.mad_practical_4_21012011158

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login: Button = findViewById(R.id.login)
        val signup: Button = findViewById(R.id.signup)

        login.setOnClickListener {
            Intent(this@LoginActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
        signup.setOnClickListener {
            Intent(this@LoginActivity, RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}