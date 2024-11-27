package com.cretlabs.automotiveui.media

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat

class MediaNotification(private val context: Context) {

    private val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    private val channelId = "media_channel"

    init {
        createNotificationChannel()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Media Playback",
                NotificationManager.IMPORTANCE_LOW
            )
            notificationManager.createNotificationChannel(channel)
        }
    }

    fun showMediaNotification(mediaInfo: MediaInfo) {
        val notification = NotificationCompat.Builder(context, channelId)
            .setContentTitle(mediaInfo.title)
            .setContentText(mediaInfo.artist)
            .setSmallIcon(android.R.drawable.ic_media_play)
            .addAction(android.R.drawable.ic_media_pause, "Pause") {
                // Handle pause action
            }
            .addAction(android.R.drawable.ic_media_next, "Next") {
                // Handle next track action
            }
            .setOngoing(true)
            .build()

        notificationManager.notify(1, notification)
    }

    fun hideMediaNotification() {
        notificationManager.cancel(1)
    }
}
