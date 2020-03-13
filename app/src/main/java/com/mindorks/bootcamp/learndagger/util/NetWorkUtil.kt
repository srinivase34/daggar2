package com.mindorks.bootcamp.learndagger.util

import android.content.Context
import android.net.ConnectivityManager

object NetWorkUtil {
    fun isInternetConnected(context: Context): Boolean{
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.activeNetworkInfo != null
    }
}