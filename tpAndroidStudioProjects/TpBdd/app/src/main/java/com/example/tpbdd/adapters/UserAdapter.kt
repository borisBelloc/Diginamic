package com.example.tpbdd.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tpbdd.R
import com.example.tpbdd.database.User
import kotlinx.android.synthetic.main.item_user.view.*


class UserAdapter (val users: List<User>) : RecyclerView.Adapter<UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return UserViewHolder(inflater, parent)
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }

//    fun addQuestion(user: User) {
//        users.add(user)
//        notifyItemInserted(users.items.size + 1 )
//    }

}

class UserViewHolder (inflater: LayoutInflater, parent: ViewGroup)
    : RecyclerView.ViewHolder(
    inflater.inflate(
        R.layout.item_user, parent, false)
)
{
    fun bind(user: User) {
    // ajout d'une question Dans adapter

        itemView.apply {
            textName.text = user.name
            textAge.text = user.age.toString()
        }
    }



}
