package com.example.dinosaursapp.network

import retrofit2.Retrofit
import retrofit2.http.GET
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType

private const val BASE_URL =
    "https://kareemy.github.io"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

interface DinosaursApiService {
    @GET("Dinosaurs/dinosaurs.json")
    suspend fun getPhotos(): List<DinosaurPhoto>
}

object DinosaursApi {
    val retrofitService : DinosaursApiService by lazy {
        retrofit.create(DinosaursApiService::class.java)
    }
}