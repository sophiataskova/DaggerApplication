package com.example.daggerapplication.dagger

import com.example.daggerapplication.R
import retrofit2.Retrofit
import javax.inject.Inject

class RequestMaker @Inject constructor(val retrofit: Retrofit, @SpecialRandom val specialRandom: Double) {

}