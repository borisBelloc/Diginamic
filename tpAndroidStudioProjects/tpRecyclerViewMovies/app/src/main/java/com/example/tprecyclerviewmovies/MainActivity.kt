package com.example.tprecyclerviewmovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tprecyclerviewmovies.adapters.MovieAdapter
import com.example.tprecyclerviewmovies.models.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val listMovies = mutableListOf<Movie>()
    listMovies.add(Movie("Matrix", 1999))
    listMovies.add(Movie("Mon voisin totoro", 1988))
    listMovies.add(Movie("Forest Gump", 2003))

    myRecycler.layoutManager = LinearLayoutManager(this)
    myRecycler.adapter = MovieAdapter(listMovies)

    }
}
