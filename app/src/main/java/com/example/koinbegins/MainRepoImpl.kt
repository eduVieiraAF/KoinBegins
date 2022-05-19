package com.example.koinbegins

class MainRepoImpl(private val api: MyApi): MainRepository {
    override fun donNetworkCall() {
        api.callApi()
    }
}