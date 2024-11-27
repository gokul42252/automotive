package com.cretlabs.automotiveui.connectivity


import android.content.Context
import android.net.wifi.WifiManager
import android.util.Log

class WiFiManager(private val context: Context) {

    private val wifiManager: WifiManager =
        context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

    fun enableWiFi(): Boolean {
        return if (!wifiManager.isWifiEnabled) {
            wifiManager.isWifiEnabled = true
            Log.d("WiFiManager", "Wi-Fi enabled")
            true
        } else {
            Log.d("WiFiManager", "Wi-Fi is already enabled")
            false
        }
    }

    fun disableWiFi(): Boolean {
        return if (wifiManager.isWifiEnabled) {
            wifiManager.isWifiEnabled = false
            Log.d("WiFiManager", "Wi-Fi disabled")
            true
        } else {
            Log.d("WiFiManager", "Wi-Fi is already disabled")
            false
        }
    }

    fun getConnectedSSID(): String? {
        val wifiInfo = wifiManager.connectionInfo
        return if (wifiInfo != null && wifiInfo.ssid != "<unknown ssid>") {
            wifiInfo.ssid
        } else {
            null
        }
    }
}
