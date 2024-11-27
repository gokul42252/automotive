package com.cretlabs.automotiveui.features.media


import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class MediaService : Service() {

    private val binder = MediaBinder()

    inner class MediaBinder : Binder() {
        fun getService(): MediaService = this@MediaService
    }

    override fun onBind(intent: Intent): IBinder {
        return binder
    }

    fun playMedia() {
        println("Playing media")
    }

    fun stopMedia() {
        println("Stopping media")
    }
}
