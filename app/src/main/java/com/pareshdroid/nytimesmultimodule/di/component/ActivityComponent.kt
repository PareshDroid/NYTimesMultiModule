package com.pareshdroid.nytimesmultimodule.di.component

import com.pareshdroid.core.di.CoreComponent
import com.pareshdroid.nytimesmultimodule.di.ActivityScope
import com.pareshdroid.nytimesmultimodule.di.module.ActivityModule
import com.pareshdroid.nytimesmultimodule.ui.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [CoreComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}