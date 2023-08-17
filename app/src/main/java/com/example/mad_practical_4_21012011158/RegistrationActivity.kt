package com.example.mad_practical_4_21012011158

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val login: Button = findViewById(R.id.Login)
        val register: Button = findViewById(R.id.register)

        login.setOnClickListener() {
            Intent(this@RegistrationActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        register.setOnClickListener() {
            Intent(this@RegistrationActivity, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}