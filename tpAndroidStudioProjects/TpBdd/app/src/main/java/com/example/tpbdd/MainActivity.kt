package com.example.tpbdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tpbdd.adapters.UserAdapter
import com.example.tpbdd.database.User
import com.example.tpbdd.database.UserDao
import com.example.tpbdd.database.getDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //        Doc : definition du Recycler
        myRecycler.layoutManager = LinearLayoutManager(this)

        val john = User(name = "John", age = 42)
        val maria = User(name = "Maria", age = 37)
        val gilles = User(name = "Gilles", age = 56)

        getDatabase(applicationContext)?.userDao()?.apply {
            insert(john, maria, gilles)

            getUsers().forEach {
                Log.d("UserTest","$it" )
            }

            //DOC : Utilisation de l'adapter
            val adapter = UserAdapter(getDatabase(applicationContext)?.userDao()?.getUsers())
            myRecycler.adapter = UserAdapter(adapter)
        }



    }
}
