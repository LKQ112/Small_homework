package com.example.smallhomework.ui.weahter

import android.view.animation.Transformation
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations

import androidx.lifecycle.ViewModel
import com.example.smallhomework.logic.Repository
import com.example.smallhomework.logic.model.LKQ_Location

class WeatherViewModel : ViewModel() {
    private val locationLiveData = MutableLiveData<LKQ_Location>()

    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat, placeName)
    }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = LKQ_Location(lng, lat)
    }

}