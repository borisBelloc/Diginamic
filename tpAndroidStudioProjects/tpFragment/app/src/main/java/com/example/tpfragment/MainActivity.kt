package com.example.tpfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        btnHome.setOnClickListener {
//            Toast.makeText(applicationContext, "btn clicked", Toast.LENGTH_SHORT).show()
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.mainPage,  FragmentHome())
//                .commit()
//        }

//        btnNews.setOnClickListener {
//            Toast.makeText(applicationContext, "btn clicked", Toast.LENGTH_SHORT).show()
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.mainPage,  FragmentNews())
//                .commit()
//        }




    }

//    Fonction générique pour afficher un fragment

    private fun Fragment.replaceFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.mainPage,  this)
            .commit()
    }

// Trouve le fragment a afficher
    fun displayFragment(view: View) {
        // When correspond a un Switch
        when (view.id) {
            R.id.btnHome -> FragmentHome().replaceFragment()
            R.id.btnNews -> FragmentNews().replaceFragment()
            R.id.btnAbout -> FragmentAbout().replaceFragment()
            R.id.btnSettings -> FragmentSettings().replaceFragment()
        }
    }
}
