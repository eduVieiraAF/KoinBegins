package com.example.koinbegins

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(private val repository: MainRepository): ViewModel() {

    fun doNetworkCall(){
       Log.d("KoinApi", "→ Testing Koin API call")
    }

}