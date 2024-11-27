package com.cretlabs.automotiveui.media


import android.media.MediaMetadataRetriever

object MediaUtils {

    fun getMediaDuration(mediaSource: MediaSource): Long {
        val mediaMetadataRetriever = MediaMetadataRetriever()
        mediaMetadataRetriever.setDataSource(mediaSource.url)
        val duration = mediaMetadataRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
        return duration?.toLong() ?: 0L
    }

    fun getMediaTitle(mediaSource: MediaSource): String {
        val mediaMetadataRetriever = MediaMetadataRetriever()
        mediaMetadataRetriever.setDataSource(mediaSource.url)
        return mediaMetadataRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_TITLE) ?: "Unknown Title"
    }
}
