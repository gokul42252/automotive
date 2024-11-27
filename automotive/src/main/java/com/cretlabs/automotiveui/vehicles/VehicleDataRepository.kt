package com.cretlabs.automotiveui.vehicles


import com.cretlabs.automotiveui.vehicles.models.VehicleTelemetry
import javax.inject.Inject

class VehicleDataRepository @Inject constructor(private val vehicleService: VehicleService) {

    fun getCurrentTelemetry(): VehicleTelemetry {
        // Fetch current vehicle telemetry from the VehicleService
        return vehicleService.getVehicleTelemetry()
    }

    fun sendVehicleCommand(command: String) {
        // Send command to the vehicle using VehicleService
        vehicleService.sendCommandToVehicle(command)
    }
}
