package com.example.koinbegins

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.scope.AndroidScopeComponent
import org.koin.core.context.startKoin
import org.koin.core.scope.Scope

class MyApplication: Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(appModule, activityModule)
        }
    }


}