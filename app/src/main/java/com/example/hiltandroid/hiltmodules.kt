package com.example.hiltandroid

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityRetainedComponent::class)
object values{
    @Provides
    @Named("One")
    fun providestring() : String ="SOme Random String"
    @Provides
    @Named("two")
    fun provideanotherstring():String {
        return "Another String"
    }

}