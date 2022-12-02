package com.example.noteful

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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

        val registar = findViewById<TextView>(R.id.registarTxt)
        registar.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegistarActivity::class.java))
            finish()
        }

        /*
        //verificar se o username e password foram preenchidos pelo utilizador
        val pw = findViewById<TextView>(R.id.passwordTxt)
        val password = pw.text.toString()

        val user = findViewById<TextView>(R.id.usernameTxt)
        val username = user.text.toString()

        val login = findViewById<Button>(R.id.loginBtn)


        login.setOnClickListener{
            if(username.isNullOrBlank() || password.isNullOrBlank()){
                println("Username: $username")
                println("Password:$password")
                Toast.makeText(this, "Não inseriu nome de utilizador ou password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
        }

         */

    }

    fun transicaoLogin() {
        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        finish()
    }



}