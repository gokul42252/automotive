package com.cretlabs.automotiveui.vehicles.utils


object TelemetryUtils {

    fun formatSpeed(speed: Int): String {
        return "$speed km/h"
    }

    fun formatFuelLevel(fuelLevel: Int): String {
        return "$fuelLevel%"
    }

    fun formatEngineTemp(engineTemp: Int): String {
        return "$engineTemp°C"
    }

    fun isEngineOverheating(engineTemp: Int): Boolean {
        // Consider 100°C as the overheating threshold for the engine
        return engineTemp > 100
    }
}
