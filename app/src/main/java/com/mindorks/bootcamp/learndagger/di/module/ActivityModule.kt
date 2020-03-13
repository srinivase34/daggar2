package com.mindorks.bootcamp.learndagger.di.module

import android.app.Activity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity: Activity) {

    @Provides
    fun provideContext() = activity
}