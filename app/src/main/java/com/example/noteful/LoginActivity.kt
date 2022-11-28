package com.example.noteful

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

    }

    fun transicaoLogin(view: View) {
        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        finish()
    }

    fun transicaoRegistar(view: View){
        startActivity(Intent(this@LoginActivity, RegistarActivity::class.java))
        finish()
    }

}