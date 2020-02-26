package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.tp3photogallery.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tp3photogallery)

//        textViewDescriptionCity.text = "exemple"

        buttonDiscard.setOnClickListener {
//            textViewDescriptionCity.text = "CANCELED"
            Toast.makeText(applicationContext, "ETES VOUS SURE ???", Toast.LENGTH_SHORT).show()
        }

    }
}
