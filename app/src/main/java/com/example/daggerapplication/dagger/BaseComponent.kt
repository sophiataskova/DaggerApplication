package com.example.daggerapplication.dagger

import com.example.daggerapplication.dagger.scopes.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(modules = [SampleModule::class])
interface BaseComponent {
    val randomMaker: RandomMaker
}