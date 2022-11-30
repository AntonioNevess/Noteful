package com.example.noteful

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val constraintLayout: ConstraintLayout = findViewById(R.id.loginLayout)
        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(1000)
        animationDrawable.setExitFadeDuration(2000)
        animationDrawable.start()

        val btnRegistar = findViewById<TextView>(R.id.registarTxt)
        btnRegistar.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegistarActivity::class.java))
            finish()
        }

    }

    fun transicaoLogin(view: View) {
        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        finish()
    }



}