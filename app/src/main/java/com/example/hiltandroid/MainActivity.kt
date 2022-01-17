package com.example.hiltandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val myview by viewModels<myviewmodel>()
    @Inject
    @Named("One")
    lateinit var mystring:String
    @Inject
    @Named("two")
    lateinit var anotherstring:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity","Injected value =${mystring}")
        Log.i("MainActivity","Injected value of another string =${anotherstring}")
        myview.print()
        myview.another()

    }
}