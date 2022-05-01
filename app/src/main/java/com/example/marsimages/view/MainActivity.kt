package com.example.marsimages.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.Keep
import com.example.marsimages.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


@Keep

data class App(val A:Int)