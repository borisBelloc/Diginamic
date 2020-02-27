package com.example.tprecyclerviewmovies.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tprecyclerviewmovies.R
import com.example.tprecyclerviewmovies.models.Contact
import com.example.tprecyclerviewmovies.models.Movie
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(val movies: MutableList<Movie>) : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

}

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup)
    : RecyclerView.ViewHolder(
    inflater.inflate(
        R.layout.item_movie, parent, false)
)
{
    fun bind(movie: Movie) {
        itemView.apply {
            textTitle.text = movie.title
            textYear.text = movie.year.toString()
        }
    }
}
