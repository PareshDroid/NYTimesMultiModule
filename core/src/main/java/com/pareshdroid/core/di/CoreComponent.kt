package com.pareshdroid.core.di


import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.pareshdroid.core.data.local.db.DatabaseService
import com.pareshdroid.core.data.remote.NetworkService
import com.pareshdroid.core.di.module.ContextModule
import com.pareshdroid.core.di.scope.ApplicationContext
import com.pareshdroid.core.utils.NetworkHelper
import com.pareshdroid.core.utils.SchedulerProvider
import dagger.Component
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 * Core component that all module's components depend on.
 *
 * @see Component
 */
@Singleton
@Component(modules = [ContextModule::class])
interface CoreComponent {

    @ApplicationContext
    fun getContext(): Context

    fun getApplication(): Application

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getSharedPreferences(): SharedPreferences

    fun getNetworkHelper(): NetworkHelper

    fun getSchedulerProvider(): SchedulerProvider

    fun getCompositeDisposable(): CompositeDisposable
}
