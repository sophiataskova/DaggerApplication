package com.example.daggerapplication.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.daggerapplication.R
import com.example.daggerapplication.dagger.DaggerBaseComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerBaseComponent.builder().build()

        val a = component.requestMaker.specialRandom
        val b = component.requestMaker.specialRandom

        val c = component.requestMaker.retrofit

        findViewById<TextView>(R.id.hi).text = "a = $a and b = $b"
    }
}
