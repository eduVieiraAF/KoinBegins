package com.example.koinbegins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityScope
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope


class MainActivity : AppCompatActivity(), AndroidScopeComponent {

    override val scope: Scope by activityScope()
    private val greet by inject<String>(named("bye"))

    private val viewModel by viewModel<MainViewModel>()
    private val api by inject<MyApi>() // will implement it lazily

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(greet)

        viewModel.doNetworkCall()

    }
}