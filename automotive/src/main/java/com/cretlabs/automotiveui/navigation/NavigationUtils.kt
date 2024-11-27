package com.cretlabs.automotiveui.navigation


object NavigationUtils {

    // Calculates distance between two GPS locations in meters
    fun calculateDistance(start: GPSLocation, end: GPSLocation): Double {
        val results = FloatArray(1)
        Location.distanceBetween(
            start.latitude, start.longitude,
            end.latitude, end.longitude,
            results
        )
        return results[0].toDouble()
    }

    // Converts GPS coordinates to a readable address (placeholder logic)
    fun convertToAddress(location: GPSLocation): String {
        // Placeholder for actual address conversion logic
        return "Address for (${location.latitude}, ${location.longitude})"
    }
}
