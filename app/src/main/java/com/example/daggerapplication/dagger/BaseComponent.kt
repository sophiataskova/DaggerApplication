package com.example.daggerapplication.dagger

import com.example.daggerapplication.dagger.scopes.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(modules = [NetworkModule::class])
interface BaseComponent {
    val requestMaker: RequestMaker
}