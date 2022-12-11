package com.example.smallhomework.logic.network

import com.example.smallhomework.SunnyWeatherApplication
import com.example.smallhomework.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
        @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
        fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>


}