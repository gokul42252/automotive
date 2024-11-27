package com.cretlabs.automotiveui.safety


import android.content.Context
import android.widget.Toast

class SafetyAlerts(private val context: Context) {

    fun showLaneDepartureAlert() {
        Toast.makeText(context, "Warning: Lane Departure Detected!", Toast.LENGTH_SHORT).show()
        // Additional actions like triggering sound or vibration can be added here
    }

    fun showCollisionWarning() {
        Toast.makeText(context, "Warning: Collision Risk Ahead!", Toast.LENGTH_SHORT).show()
        // Additional actions like flashing lights or vibrating steering wheel
    }

    fun showParkingAssistance() {
        Toast.makeText(context, "Activating Parking Assistance...", Toast.LENGTH_SHORT).show()
    }

    fun showFatigueWarning() {
        Toast.makeText(context, "Warning: Driver Fatigue Detected!", Toast.LENGTH_SHORT).show()
    }
}
