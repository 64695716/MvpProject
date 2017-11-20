package com.example.admin.mvpproject.di.modules

import android.content.Context
import com.example.admin.mvpproject.di.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by admin on 2017/11/13.
 */
@Module(subcomponents = arrayOf(
//        register your activities' subcomponents here
))
class AppModule {

    @Singleton
    @Provides
    internal fun provideContext(application: App): Context = application.applicationContext
}