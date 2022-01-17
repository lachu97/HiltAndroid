package com.example.hiltandroid

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class myviewmodel @Inject constructor(
    @Named("One") var newvalue :String,
    @Named("two") var anther:String
) : ViewModel(){

    fun print(){
        Log.i("Viewmodel","value =${newvalue}")
    }
    fun another(){
        Log.i("Viewmodel","value =${anther}")
    }
}