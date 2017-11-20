package com.example.admin.mvpproject.di.components

import com.example.admin.mvpproject.di.App
import com.example.admin.mvpproject.di.factories.ActivitiesInjectorFactories
import com.example.admin.mvpproject.di.factories.FragmentsInjectorFactories
import com.example.admin.mvpproject.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by admin on 2017/11/13.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ActivitiesInjectorFactories::class,
        FragmentsInjectorFactories::class,
        AppModule::class
))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}