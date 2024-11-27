package com.cretlabs.automotiveui.media


import android.location.Location
import android.util.Log

class GPSManager {

    private var currentLocation: GPSLocation? = null

    fun startGPSTracking() {
        Log.d("GPSManager", "GPS tracking started")
        // Implement GPS tracking setup
    }

    fun stopGPSTracking() {
        Log.d("GPSManager", "GPS tracking stopped")
        // Implement stopping GPS tracking
    }

    fun updateLocation(location: GPSLocation) {
        currentLocation = location
        Log.d("GPSManager", "Updated location: $location")
    }

    fun getCurrentLocation(): GPSLocation? {
        return currentLocation
    }
}
