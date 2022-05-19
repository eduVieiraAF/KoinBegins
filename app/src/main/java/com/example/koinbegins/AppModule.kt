package com.example.koinbegins

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {

    single {
        Retrofit.Builder()
            .baseUrl("https://google.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }

    single<MainRepository> {
        MainRepoImpl(get()) // Koin will find the instance it needs on its own
    }

    viewModel {
        MainViewModel(get()) // Koin already knows how to create repository
    }
}