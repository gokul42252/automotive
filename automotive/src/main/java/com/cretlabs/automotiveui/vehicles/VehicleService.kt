package com.cretlabs.automotiveui.vehicles


import android.content.Context
import com.cretlabs.automotiveui.vehicles.models.VehicleTelemetry

class VehicleService(private val context: Context) {

    private val canBusManager = CANBusManager()

    fun getVehicleTelemetry(): VehicleTelemetry {
        // Interface with the Vehicle HAL (Hardware Abstraction Layer) to fetch telemetry data
        val vehicleData = canBusManager.fetchTelemetryData()
        return VehicleTelemetry(vehicleData.speed, vehicleData.fuelLevel, vehicleData.engineTemp)
    }

    fun sendCommandToVehicle(command: String) {
        // Send command to the vehicle via CAN Bus
        canBusManager.sendCommand(command)
    }
}
