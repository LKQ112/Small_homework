package com.example.smallhomework.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.example.smallhomework.SunnyWeatherApplication
import com.example.smallhomework.logic.model.LKQ_Place
import com.google.gson.Gson

object Placedao {
    fun savePlace(place: LKQ_Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): LKQ_Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, LKQ_Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}