package com.example.noteful

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegistarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registar)
        supportActionBar?.hide()
    }

    fun transicaoMain(view: View) {
        startActivity(Intent(this@RegistarActivity, MainActivity::class.java))
        finish()
    }
}