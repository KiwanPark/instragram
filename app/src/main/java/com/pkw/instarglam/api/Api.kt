package com.pkw.instarglam.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("/album")
    fun album(): Call<AlbumData>

    @GET("/albumItem")
    fun albumItem(@Query("id") id: String): Call<AlbumItemResponse>
}