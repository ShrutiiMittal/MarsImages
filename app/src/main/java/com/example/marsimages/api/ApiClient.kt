package com.example.marsimages.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.HttpURLConnection

class ApiClient {

    companion object{
        private var apiClient: Retrofit? =null

    }
    fun getClient(url: String): Retrofit{
        if(apiClient==null)
        {
            val gson=GsonBuilder().create()
            apiClient=Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create(gson)).build()
        }
        return apiClient!!
    }
}