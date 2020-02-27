package com.example.tprecyclerviewmovies.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.tprecyclerviewmovies.R
import com.example.tprecyclerviewmovies.models.Contact
import kotlinx.android.synthetic.main.item_contact.view.*


class ContactAdapter(val contacts: List<Contact>) : RecyclerView.Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ContactViewHolder(inflater, parent)
    }

    override fun getItemCount() = contacts.size

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

}

class ContactViewHolder(inflater: LayoutInflater, parent: ViewGroup)
    : RecyclerView.ViewHolder(
    inflater.inflate(
        R.layout.item_contact, parent, false)
)
{
    fun bind(contact: Contact) {
        itemView.apply {
            textName.text = contact.name
            textAge.text = contact.age.toString()
            imgAvatar.setImageDrawable(
                ContextCompat.getDrawable(itemView.context, contact.avatar))
//            viewIsValid.text = contact.isValid
        }
    }
}