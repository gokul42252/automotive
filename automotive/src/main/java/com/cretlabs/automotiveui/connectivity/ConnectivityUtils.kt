package com.cretlabs.automotiveui.connectivity


import android.content.Context
import android.net.wifi.WifiManager
import android.util.Log

object ConnectivityUtils {

    fun scanAvailableNetworks(context: Context): List<String> {
        val wifiManager =
            context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
        val scanResults = wifiManager.scanResults
        val networkNames = scanResults.map { it.SSID }
        Log.d("ConnectivityUtils", "Available networks: $networkNames")
        return networkNames
    }

    fun getBluetoothStatus(): String {
        // Dummy function for checking Bluetooth status
        return "Bluetooth is active"
    }
}
