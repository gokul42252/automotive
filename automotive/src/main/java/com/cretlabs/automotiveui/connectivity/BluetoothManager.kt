package com.cretlabs.automotiveui.connectivity


import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.util.Log

class BluetoothManager {

    private val bluetoothAdapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()

    fun enableBluetooth(): Boolean {
        return if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled) {
            bluetoothAdapter.enable()
            Log.d("BluetoothManager", "Bluetooth enabled")
            true
        } else {
            Log.d("BluetoothManager", "Bluetooth is already enabled or not supported")
            false
        }
    }

    fun disableBluetooth(): Boolean {
        return if (bluetoothAdapter != null && bluetoothAdapter.isEnabled) {
            bluetoothAdapter.disable()
            Log.d("BluetoothManager", "Bluetooth disabled")
            true
        } else {
            Log.d("BluetoothManager", "Bluetooth is already disabled or not supported")
            false
        }
    }

    fun getPairedDevices(): Set<BluetoothDevice>? {
        return bluetoothAdapter?.bondedDevices
    }

    fun connectToDevice(device: BluetoothDevice) {
        Log.d("BluetoothManager", "Connecting to device: ${device.name}")
        // Placeholder for Bluetooth connection logic
    }
}
