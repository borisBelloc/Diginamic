package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_login.*


class loginActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        checkBoxNoPw.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
            Toast.makeText(applicationContext, "ting", Toast.LENGTH_SHORT).show()
            }
        }
        nightMode.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                loginPage.setBackgroundColor(Color.parseColor("#FF263A43"));
//                buttonConnect.setBackgroundColor(Color.parseColor("#FFFFFF"))

            } else {
                loginPage.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        }


        buttonConnect.setOnClickListener {
            if (checkBoxNoPw.isChecked) {
                Toast.makeText(applicationContext, "STATUS VALIDATED", Toast.LENGTH_SHORT).show()
                loggin()
            } else {
                connectWithPassword()
            }




        }
    }

    fun connectWithPassword() {
        val password = editPassword.text.toString()
        if (password == "aaa") {
            intent.putExtra(EXTRA_PASSWORD, password)
            loggin()
        } else {
            Toast.makeText(applicationContext, "Mauvais mot de passe", Toast.LENGTH_SHORT).show()
            editPassword.setText("")
        }
    }

    fun loggin() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }


}
