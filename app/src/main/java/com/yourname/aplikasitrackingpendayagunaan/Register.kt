package com.yourname.aplikasitrackingpendayagunaan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val btnRegister = findViewById<Button>(R.id.btn_register)
        btnRegister.setOnClickListener { goToMainActivity() }
    }


    private  fun  goToMainActivity () {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}