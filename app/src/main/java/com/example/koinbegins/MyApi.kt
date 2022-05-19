package com.example.koinbegins

import retrofit2.http.GET

interface MyApi {

    @GET("endpoint")
    fun callApi()
}