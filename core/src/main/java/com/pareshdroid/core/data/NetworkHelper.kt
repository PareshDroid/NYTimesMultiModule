package com.pareshdroid.core.data

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkHelper @Inject constructor(context: Context) {

    val isNetworkConnected: Boolean
        get() = false
}