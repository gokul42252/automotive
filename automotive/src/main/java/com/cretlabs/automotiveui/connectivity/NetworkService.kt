package com.cretlabs.automotiveui.connectivity


import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.util.Log

class NetworkService(private val context: Context) {

    private val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    fun isInternetAvailable(): Boolean {
        val activeNetwork = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(activeNetwork)
        return capabilities?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) ?: false
    }

    fun isCellularNetworkActive(): Boolean {
        val activeNetwork = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(activeNetwork)
        return capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ?: false
    }

    fun isWiFiNetworkActive(): Boolean {
        val activeNetwork = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(activeNetwork)
        return capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ?: false
    }

    fun logNetworkStatus() {
        Log.d("NetworkService", "Internet available: ${isInternetAvailable()}")
        Log.d("NetworkService", "Cellular network active: ${isCellularNetworkActive()}")
        Log.d("NetworkService", "Wi-Fi network active: ${isWiFiNetworkActive()}")
    }
}
