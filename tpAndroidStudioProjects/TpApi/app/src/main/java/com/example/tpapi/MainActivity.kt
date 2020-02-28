package com.example.tpapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tpapi.adapters.QuestionAdapter
import com.example.tpapi.api.models.Item
import com.example.tpapi.api.models.Questions
import com.example.tpapi.api.stackService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Doc : definition du Recycler
        myRecycler.layoutManager = LinearLayoutManager(this)

        stackService.getQuestions().enqueue(object  : retrofit2.Callback<Questions> {

            override fun onResponse(call: Call<Questions>, response: Response<Questions>) {
                Log.i("StackService", "Response : onResponse")
                if (response.isSuccessful) {
                    Log.i("StackService", "Response : successful")
                    val questions = response.body()
//                    Toutes les questions LOG :
                    questions?.items?.forEach {Log.i("StackService", "questions : $it ")}
//                    DOC : Utilisation de l'adapter
                    if (questions != null) {
                        myRecycler.adapter = QuestionAdapter(questions.items)
                    }
//                    var listQuestions = mutableListOf<Item>()
//                    questions?.items?.forEach { listQuestions.add { it } }

                    // Derniere questions
                    val firstQuestion = questions!!.items[0].title
                    Log.i("StackService", "première question : $firstQuestion")
                } else {
                    Log.e("StackService", "Error : Not successful")
                }
            }

            override fun onFailure(call: Call<Questions>, t: Throwable) {
                Log.e("StackService", "Error : onFaillure!")
            }

        })






    }
}
