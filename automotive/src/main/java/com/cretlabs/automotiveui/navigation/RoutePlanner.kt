package com.cretlabs.automotiveui.navigation


class RoutePlanner {

    fun calculateRoute(startPoint: Waypoint, endPoint: Waypoint): List<Waypoint> {
        // Dummy route calculation logic
        return listOf(startPoint, Waypoint(12.9716, 77.5946), endPoint)
    }
}
