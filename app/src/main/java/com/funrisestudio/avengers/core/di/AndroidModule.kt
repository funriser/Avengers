package com.funrisestudio.avengers.core.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AndroidModule (private val application: Application) {

    @Provides
    @Singleton
    fun context (): Context = application

}