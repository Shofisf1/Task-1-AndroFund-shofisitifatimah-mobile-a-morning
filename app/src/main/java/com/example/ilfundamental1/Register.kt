package com.example.ilfundamental1
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
class Register : AppCompatActivity(), View.OnClickListener {
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        etUsername = findViewById(R.id.register_username)
        etPassword = findViewById(R.id.Register_password)
        etConfirmPassword = findViewById(R.id.register_konfirpassword)
        val btnRegister:Button = findViewById(R.id.register_button)
        btnRegister.setOnClickListener(this)
}
    override fun onClick(v: View) {
        when(v.id){
        R.id.register_button-> {
            val bundle = Bundle ()
            bundle.putString("username", etUsername.text.toString())
            bundle.putString("password", etPassword.text.toString())
            val intent = Intent( this@Register, Login::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        }
    }
    }