package com.cretlabs.automotiveui.navigation


package com.mycompany.automotiveivi.navigation

import android.util.Log

class NavigationService(
    private val routePlanner: RoutePlanner,
    private val mapRenderer: MapRenderer,
    private val gpsManager: GPSManager
) {

    private var currentRoute: List<Waypoint> = listOf()

    fun startNavigation(startPoint: Waypoint, endPoint: Waypoint) {
        Log.d("NavigationService", "Starting navigation from $startPoint to $endPoint")
        currentRoute = routePlanner.calculateRoute(startPoint, endPoint)
        mapRenderer.renderMap(currentRoute)
        gpsManager.startGPSTracking()
    }

    fun stopNavigation() {
        Log.d("NavigationService", "Stopping navigation")
        gpsManager.stopGPSTracking()
    }

    fun updateLocation(location: GPSLocation) {
        gpsManager.updateLocation(location)
        mapRenderer.updateCurrentLocation(location)
    }
}
