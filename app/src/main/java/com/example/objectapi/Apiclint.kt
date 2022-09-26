package com.example.objectapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Apiclint {

    companion object{

        fun getRetrofit() : Retrofit {
            val url = "https://datausa.io/"
            var retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }

    }
/*
    https://datausa.io/api/data?drilldowns=Nation&measures=Population
*/

}