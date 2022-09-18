package com.pkw.instarglam.api

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("/album")
    fun album(): Call<AlbumData>

}