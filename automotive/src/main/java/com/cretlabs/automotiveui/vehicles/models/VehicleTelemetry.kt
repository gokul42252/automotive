package com.cretlabs.automotiveui.vehicles.models


data class VehicleTelemetry(
    val speed: Int,           // Vehicle speed in km/h
    val fuelLevel: Int,       // Fuel level in percentage
    val engineTemp: Int       // Engine temperature in Celsius
)
