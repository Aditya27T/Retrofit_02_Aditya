package com.example.retrofit_02_aditya.api

import com.example.retrofit_02_aditya.model.IndonesiaResponse
import com.example.retrofit_02_aditya.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}