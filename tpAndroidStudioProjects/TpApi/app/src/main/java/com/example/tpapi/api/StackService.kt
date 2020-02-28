package com.example.tpapi.api

import com.example.tpapi.api.models.Questions
import retrofit2.Call
import retrofit2.http.GET

interface StackService {

    @GET("questions?order=desc&sort=activity&site=stackoverflow")
    fun getQuestions() : Call<Questions>



}