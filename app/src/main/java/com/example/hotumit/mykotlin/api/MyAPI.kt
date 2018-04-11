package com.example.hotumit.mykotlin.api

import com.example.hotumit.mykotlin.model.PhotoItemCollectionDao
import retrofit2.Call
import retrofit2.http.POST


interface MyAPI {
    @POST("list")
    fun loadPhotoList(): Call<PhotoItemCollectionDao>

}