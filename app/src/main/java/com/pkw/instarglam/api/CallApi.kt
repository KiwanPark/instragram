package com.pkw.instarglam.api

import android.util.Log
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class CallApi {
    var gson = GsonBuilder().setLenient().create()
    private val client: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(1, TimeUnit.MINUTES)
        .readTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .build()
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://us-central1-findpcroom-f0e38.cloudfunctions.net/")
        .addConverterFactory(GsonConverterFactory.create(gson!!))
        .client(client)
        .build()

    fun loadAlbum() {
        retrofit.create(Api::class.java).album().enqueue(object : Callback<AlbumData>{
            override fun onResponse(call: Call<AlbumData>, response: Response<AlbumData>) {
                Log.e("res", response.body()?.data.toString())
            }

            override fun onFailure(call: Call<AlbumData>, t: Throwable) {

            }

        })
    }
}