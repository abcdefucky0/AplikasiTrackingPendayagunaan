package com.yourname.aplikasitrackingpendayagunaan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            goToMainActivity()
        }
    }

    private  fun goToMainActivity () {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}