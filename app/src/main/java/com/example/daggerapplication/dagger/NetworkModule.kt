package com.example.daggerapplication.dagger

import com.example.daggerapplication.dagger.scopes.ApplicationScope
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit


@Module
object NetworkModule {
    @Provides
    @JvmStatic
    fun getRetrofit(client: OkHttpClient
    ) : Retrofit {
        return Retrofit.Builder().baseUrl("http://reddit.com").callFactory(client).build()
    }

    @Provides
    @JvmStatic
    fun getOkhttpClient() : OkHttpClient {
        return OkHttpClient.Builder().build()
    }
    
//    @ApplicationScope
    @Provides
    @JvmStatic
    @SpecialRandom
    fun getRandomNum(): Double {
        return Math.random()
    }
}