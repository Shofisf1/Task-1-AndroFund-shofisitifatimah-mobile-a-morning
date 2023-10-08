package com.example.ilfundamental1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity(), View.OnClickListener {
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etUsername = findViewById(R.id.login_username)
        etPassword = findViewById(R.id.login_password)
        val bundle = intent.extras
        if (bundle != null){
            etUsername.setText(bundle.getString( "username"))
            etPassword.setText(bundle.getString( "password"))
        }
        val btnLogin : Button = findViewById(R.id.login_button)
        btnLogin.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id){
            R.id.login_button -> {
                val intent = Intent ( this@Login, home::class.java)
                startActivity(intent)
            }
        }
    }
}