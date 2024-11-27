package com.cretlabs.automotiveui.media


import android.util.Log

enum class PlaybackState {
    PLAYING, PAUSED, STOPPED
}

class PlaybackManager {

    var state: PlaybackState = PlaybackState.STOPPED
        private set

    fun updateState(newState: PlaybackState) {
        Log.d("PlaybackManager", "Updating playback state: $newState")
        state = newState
    }
}
