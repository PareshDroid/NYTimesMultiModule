package com.pareshdroid.nytimesmultimodule


import android.app.Application
import android.content.Context
import com.pareshdroid.core.di.CoreComponent
import com.pareshdroid.core.di.DaggerCoreComponent
import com.pareshdroid.core.di.module.ContextModule
import com.pareshdroid.nytimesmultimodule.di.component.DaggerAppComponent
import javax.inject.Inject

class MyApplication() : Application() {

    lateinit var coreComponent: CoreComponent


    companion object {

        /**
         * Obtain core dagger component.
         *
         * @param context The application context
         */
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as? MyApplication)?.coreComponent
    }

    override fun onCreate() {
        super.onCreate()
        getCoreDependencies()
        getAppDependency()
    }

    private fun getAppDependency() {
        DaggerAppComponent
            .builder()
            .coreComponent(coreComponent)
            .build()
            .inject(this)
    }

    fun getCoreDependencies(){

        coreComponent = DaggerCoreComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()

    }
}