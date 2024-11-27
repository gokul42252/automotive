package com.cretlabs.automotiveui.media


import android.util.Log

class MapRenderer {

    fun renderMap(route: List<Waypoint>) {
        Log.d("MapRenderer", "Rendering map for route: $route")
        // Add logic to display the map and plot the route
    }

    fun updateCurrentLocation(location: GPSLocation) {
        Log.d("MapRenderer", "Updating current location: $location")
        // Update the map with the current GPS location
    }
}
