package com.cretlabs.automotiveui.userinterface.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mycompany.automotiveivi.databinding.ItemMediaBinding

class MediaListAdapter(private val mediaItems: List<String>) :
    RecyclerView.Adapter<MediaListAdapter.MediaViewHolder>() {

    inner class MediaViewHolder(private val binding: ItemMediaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.mediaTitle.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
        val binding = ItemMediaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MediaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
        holder.bind(mediaItems[position])
    }

    override fun getItemCount() = mediaItems.size
}
