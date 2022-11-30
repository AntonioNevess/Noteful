package com.example.noteful

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class RegistarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registar)
        supportActionBar?.hide()

        val constraintLayout: ConstraintLayout = findViewById(R.id.registarLayout)
        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(1000)
        animationDrawable.setExitFadeDuration(2000)
        animationDrawable.start()
    }

    fun transicaoLogin(view: View) {
        startActivity(Intent(this@RegistarActivity, LoginActivity::class.java))
        finish()
    }
}