package com.example.hotumit.mykotlin.model

import com.google.gson.annotations.SerializedName


data class PhotoItemCollectionDao(
        @SerializedName("success") val success: Boolean,
        @SerializedName("data") val data: List<PhotoItemDao>
)
