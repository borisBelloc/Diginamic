package com.example.tpbdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tpbdd.database.User
import com.example.tpbdd.database.getDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val john = User(name = "John", age = 42)
        val maria = User(name = "Maria", age = 37)
        val gilles = User(name = "Gilles", age = 56)

        getDatabase(applicationContext)?.userDao()?.apply {
            insert(john, maria, gilles)

            getUsers().forEach {
                Log.d("UserTest","$it" )
            }

        }

    }
}
