package com.pkw.instarglam.api


import androidx.annotation.Keep

@Keep
data class AlbumItemResponse(
    val code: Int = 0,
    val `data`: Data = Data(),
    val message: String = ""
) {
    @Keep
    data class Data(
        val albumInfo: String = "",
        val artist: String = "",
        val artistInfo: String = "",
        val id: String = "",
        val imgUrl: String = "",
        val name: String = ""
    )
}