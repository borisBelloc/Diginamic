package com.example.tpapi.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.tpapi.R
import com.example.tpapi.api.models.Item
import com.example.tpapi.api.models.Questions
import kotlinx.android.synthetic.main.item_question.view.*

class QuestionAdapter (val questions: List<Item>) : RecyclerView.Adapter<QuestionViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return QuestionViewHolder(inflater, parent)
    }

    override fun getItemCount() = questions.size

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.bind(questions[position])
    }


}

class QuestionViewHolder (inflater: LayoutInflater, parent: ViewGroup)
    : RecyclerView.ViewHolder(
    inflater.inflate(
        R.layout.item_question, parent, false)
)
{
    fun bind(question: Item) {


        itemView.apply {
            textDisplayName.text = question.title
//            textDisplayName.text = question.owner.displayName
//            textCreationDate.text = question.items.creationDate.toString()
//            imgProfileImage.setImageDrawable(
//                ContextCompat.getDrawable(itemView.context, contact.avatar))
        }
    }
}
