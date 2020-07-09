package com.pareshdroid.nytimesmultimodule.di.module

import android.app.Activity
import android.content.Context
import com.pareshdroid.core.di.scope.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity:Activity) {

    @ActivityContext
    @Provides
    fun provideContext() : Context = activity

}