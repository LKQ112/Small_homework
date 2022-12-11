package com.example.smallhomework.logic.model

import com.google.gson.annotations.SerializedName

class LKQ_RealtimeResponse(val status: String, val result: Result) {

    class Result(val realtime: LKQ_Realtime)

    class LKQ_Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: LKQ_AirQuality)

    class LKQ_AirQuality(val aqi: LKQ_AQI)

    class LKQ_AQI(val chn: Float)

}