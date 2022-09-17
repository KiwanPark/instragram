package com.pkw.instarglam

import androidx.annotation.Keep

@Keep
data class DemandData(
    var imageUri:String? = "",
    var name:String? = "",
    var nickname:String? = "",
)
