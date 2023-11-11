package com.example.dinosaursapp.network

import kotlinx.serialization.SerialName
import  kotlinx.serialization.Serializable

@Serializable
data class DinosaurPhoto(
    val name: String,
    val length: String,
    val description: String,
    @SerialName(value = "img_src")
    val imgSrc: String,

)
