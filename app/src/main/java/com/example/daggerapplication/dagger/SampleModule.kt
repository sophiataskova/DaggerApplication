package com.example.daggerapplication.dagger

import dagger.Module
import dagger.Provides


@Module
object SampleModule {

//    @ApplicationScope
    @Provides
    @JvmStatic
    @SpecialRandom
    fun getRandomNum(): Double {
        return Math.random()
    }
}