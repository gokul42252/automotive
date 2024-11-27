package com.cretlabs.automotiveui.safety


import android.util.Log

object SafetyUtils {

    fun calculateSafeDistance(speed: Int): Int {
        // Basic formula: safe distance = speed * 2 (in meters)
        val safeDistance = speed * 2
        Log.d("SafetyUtils", "Calculated safe distance: $safeDistance meters for speed $speed km/h")
        return safeDistance
    }

    fun isDriverFatigueDetected(eyeBlinkRate: Int): Boolean {
        // Simple fatigue detection logic based on eye blink rate
        val isFatigued = eyeBlinkRate < 15 // Assume fatigue if blink rate < 15 blinks/min
        Log.d("SafetyUtils", "Driver fatigue detected: $isFatigued")
        return isFatigued
    }

    fun analyzeLanePosition(vehiclePosition: Float, laneCenter: Float): Boolean {
        val deviation = Math.abs(vehiclePosition - laneCenter)
        val isDeparting = deviation > 1.5 // Assume lane departure if deviation > 1.5 meters
        Log.d("SafetyUtils", "Lane departure detected: $isDeparting")
        return isDeparting
    }
}
