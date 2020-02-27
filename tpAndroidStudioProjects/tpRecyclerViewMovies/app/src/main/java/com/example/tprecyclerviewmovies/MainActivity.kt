package com.example.tprecyclerviewmovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tprecyclerviewmovies.adapters.ContactAdapter
import com.example.tprecyclerviewmovies.adapters.MovieAdapter
import com.example.tprecyclerviewmovies.models.Contact
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Exemple TP Movie
//    val listMovies = mutableListOf<Movie>()
//    listMovies.add(Movie("Matrix", 1999))
//    listMovies.add(Movie("Mon voisin totoro", 1988))
//    listMovies.add(Movie("Forest Gump", 2003))
//
//    myRecycler.layoutManager = LinearLayoutManager(this)
//    myRecycler.adapter = MovieAdapter(listMovies)

    val listContact = mutableListOf<Contact>()
        listContact.add(Contact("Justin Trudeau", 1985, "c:/todo", true))
        listContact.add(Contact("Alex", 1988, "c:/todo", true))
        listContact.add(Contact("Alice", 2003, "c:/todo", false))
        listContact.add(Contact("Emilie", 1986, "c:/todo", true))
        listContact.add(Contact("Pierrot", 1985, "c:/todo", true))
        listContact.add(Contact("Emilie", 1986, "c:/todo", false))
        listContact.add(Contact("Pédro", 1986, "c:/todo", false))
        listContact.add(Contact("Boris", 1986, "c:/todo", true))

    myRecycler.layoutManager = LinearLayoutManager(this)
    myRecycler.adapter = ContactAdapter(listContact)



    }
}
