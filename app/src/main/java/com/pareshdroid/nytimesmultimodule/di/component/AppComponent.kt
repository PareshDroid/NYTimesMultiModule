package com.pareshdroid.nytimesmultimodule.di.component

import com.pareshdroid.core.di.CoreComponent
import com.pareshdroid.core.di.scope.AppScope
import com.pareshdroid.nytimesmultimodule.MyApplication
import com.pareshdroid.nytimesmultimodule.di.module.AppModule
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class]
)
interface AppComponent {

    /**
     * Inject dependencies on application.
     *
     * @param application The sample application.
     */
    fun inject(application: MyApplication)
}