package com.pareshdroid.core.data.remote

import android.content.Context
import com.pareshdroid.core.di.scope.NetworkInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(private val context:Context,
                                         @NetworkInfo private val apiKey:String){

    val dummyData: String
        get() = "NETWORK_DUMMY_DATA"

}