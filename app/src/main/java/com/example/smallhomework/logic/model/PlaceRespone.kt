package com.example.smallhomework.logic.model

import com.google.gson.annotations.SerializedName
class PlaceResponse(val status: String, val places: List<LKQ_Place>)

class LKQ_Place(val name: String, val location: LKQ_Location, @SerializedName("formatted_address") val address: String)

class LKQ_Location(val lng: String, val lat: String)



