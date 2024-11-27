package com.cretlabs.automotiveui.vehicles

import com.google.android.gms.common.internal.TelemetryData


class CANBusManager {

    // Mock function to simulate fetching telemetry data from the vehicle's CAN bus
    fun fetchTelemetryData(): TelemetryData {
        // Simulating telemetry data
        return com.cretlabs.automotiveui.vehicles.models.TelemetryData(
            speed = 120,       // Speed in km/h
            fuelLevel = 50,    // Fuel level in percentage
            engineTemp = 90    // Engine temperature in Celsius
        )
    }

    // Mock function to simulate sending a command to the vehicle via CAN bus
    fun sendCommand(command: String) {
        println("Sending command: $command")
        // In a real application, this would interact with the vehicle's hardware
    }
}
