package com.example.objectapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Apiinterface {

    @GET("api/data")
    fun getNews(@Query("drilldowns")c1 :String, @Query("measures")cate : String) : Call<Datamodel>
}