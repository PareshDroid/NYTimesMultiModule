package com.pareshdroid.core.di


import android.content.Context
import com.pareshdroid.core.data.NetworkHelper
import com.pareshdroid.core.data.local.DatabaseService
import com.pareshdroid.core.data.remote.NetworkService
import com.pareshdroid.core.di.module.ContextModule
import com.pareshdroid.core.di.module.UtilsModule
import dagger.Component
import javax.inject.Singleton

/**
 * Core component that all module's components depend on.
 *
 * @see Component
 */
@Singleton
@Component(modules = [ContextModule::class, UtilsModule::class])
interface CoreComponent {

    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getNetworkHelper(): NetworkHelper

}
