package com.example.shoppinglistapplication.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppinglistapplication.R
import com.example.shoppinglistapplication.Utils.addFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(MainFragment.newInstance(this),R.id.fragmentContainer)
    }
    companion object {

         private val EMPYT_ARG_FOR_FRAGMENT:String = ""
    }
}
