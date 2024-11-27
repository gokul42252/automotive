package com.cretlabs.automotiveui.media

import android.content.Context
import android.media.MediaPlayer
import android.util.Log

class MediaService(private val context: Context) {

    private var mediaPlayer: MediaPlayer? = null
    private val playbackManager = PlaybackManager()

    init {
        mediaPlayer = MediaPlayer()
    }

    fun playMedia(mediaSource: MediaSource) {
        try {
            mediaPlayer?.reset()
            mediaPlayer?.setDataSource(mediaSource.url)
            mediaPlayer?.prepare()
            mediaPlayer?.start()
            playbackManager.updateState(PlaybackState.PLAYING)
        } catch (e: Exception) {
            Log.e("MediaService", "Error playing media", e)
        }
    }

    fun pauseMedia() {
        mediaPlayer?.pause()
        playbackManager.updateState(PlaybackState.PAUSED)
    }

    fun stopMedia() {
        mediaPlayer?.stop()
        playbackManager.updateState(PlaybackState.STOPPED)
    }

    fun getPlaybackState(): PlaybackState {
        return playbackManager.state
    }
}
