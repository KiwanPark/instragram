package com.pkw.instarglam.api


import androidx.annotation.Keep

@Keep
data class AlbumData(
    val code: Int? = 0,
    val `data`: List<Data?>? = listOf(),
    val message: String? = ""
) {
    @Keep
    data class Data(
        val artist: String? = "",
        val id: String? = "",
        val imgUrl: String? = "",
        val name: String? = ""
    )
}