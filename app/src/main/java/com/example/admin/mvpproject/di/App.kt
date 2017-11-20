package com.example.admin.mvpproject.di

import android.app.Activity
import android.app.Application
import com.example.admin.mvpproject.di.components.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import javax.inject.Inject

/**
 * Created by admin on 2017/11/13.
 */
class App : Application(), HasDispatchingActivityInjector {

    //TODO REMINDER: register this class in AndroidManifest.xml

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }
}