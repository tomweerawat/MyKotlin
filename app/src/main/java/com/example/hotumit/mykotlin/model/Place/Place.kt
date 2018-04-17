package com.example.hotumit.mykotlin.model.Place
import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName



data class PlaceDao(
		@SerializedName("html_attributions") val htmlAttributions: List<String>,
		@SerializedName("next_page_token") val nextPageToken: String,
		@SerializedName("results") val results: List<Result>,
		@SerializedName("status") val status: String
)

data class Result(
		@SerializedName("geometry") val geometry: Geometry,
		@SerializedName("icon") val icon: String,
		@SerializedName("id") val id: String,
		@SerializedName("name") val name: String,
		@SerializedName("photos") val photos: List<Photo>,
		@SerializedName("place_id") val placeId: String,
		@SerializedName("reference") val reference: String,
		@SerializedName("scope") val scope: String,
		@SerializedName("types") val types: List<String>,
		@SerializedName("vicinity") val vicinity: String
)

data class Geometry(
		@SerializedName("location") val location: Location,
		@SerializedName("viewport") val viewport: Viewport
)

data class Location(
		@SerializedName("lat") val lat: Double,
		@SerializedName("lng") val lng: Double
)

data class Viewport(
		@SerializedName("northeast") val northeast: Northeast,
		@SerializedName("southwest") val southwest: Southwest
)

data class Southwest(
		@SerializedName("lat") val lat: Double,
		@SerializedName("lng") val lng: Double
)

data class Northeast(
		@SerializedName("lat") val lat: Double,
		@SerializedName("lng") val lng: Double
)

data class Photo(
		@SerializedName("height") val height: Int,
		@SerializedName("html_attributions") val htmlAttributions: List<String>,
		@SerializedName("photo_reference") val photoReference: String,
		@SerializedName("width") val width: Int
)