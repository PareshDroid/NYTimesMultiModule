package com.pareshdroid.nytimesmultimodule.ui

import com.pareshdroid.core.data.local.DatabaseService
import com.pareshdroid.core.data.remote.NetworkService
import com.pareshdroid.nytimesmultimodule.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(private val databaseService: DatabaseService, private val networkService: NetworkService) {

    fun getSomeData():String = "${databaseService.dummyData} ${networkService.dummyData}"
}