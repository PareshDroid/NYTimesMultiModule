package com.pareshdroid.core.di.module

import com.pareshdroid.core.di.scope.DatabaseInfo
import com.pareshdroid.core.di.scope.NetworkInfo
import dagger.Module
import dagger.Provides

@Module
class UtilsModule {



    @Provides
    @DatabaseInfo
    fun provideDatabaseName():String = "dummy_db"


    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion():Int = 1


    @Provides
    @NetworkInfo
    fun provideApiKey():String = "SOME_API_KEY"

}