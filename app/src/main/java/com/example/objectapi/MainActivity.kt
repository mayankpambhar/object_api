package com.example.objectapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.objectapi.Apiclint.Companion.getRetrofit
import com.example.objectapi.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getNews("Nation","Population")


    }



    fun  getNews(drilldowns  :String, measures:String){
        var  apiInterface = getRetrofit().create(Apiinterface::class.java)
//        apiInterface.getNews(country,catagory,"95212db04ccb4eeab6ed771b8b531a92")

        apiInterface.getNews(drilldowns,measures).enqueue(object:
            Callback<Datamodel> {
            override fun onResponse(call: Call<Datamodel>, response: Response<Datamodel>) {
                Log.e("TAG", "onResponse: ${response.body()}", )

                var list  = response.body()
                setUpRvView(list)
            }

            override fun onFailure(call: Call<Datamodel>, t: Throwable) {
                Log.e("TAG", "onFailure: ${t.message}", )
            }
        })
    }


    fun setUpRvView(l1: Datamodel?){
        var adapter  = myAdepter(this,l1)
        var lm = LinearLayoutManager(this)
        binding.rvview.adapter = adapter
        binding.rvview.layoutManager = lm
    }
}