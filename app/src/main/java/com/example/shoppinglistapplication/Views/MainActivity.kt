package com.example.shoppinglistapplication.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppinglistapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    companion object {

         private val WELCOME_FRAGMENT_TAG = "welcome_fragment_tag"
    }
}
