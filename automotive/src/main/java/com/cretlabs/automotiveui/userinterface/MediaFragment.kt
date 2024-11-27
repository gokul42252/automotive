package com.cretlabs.automotiveui.userinterface


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mycompany.automotiveivi.databinding.FragmentMediaBinding

class MediaFragment : Fragment() {

    private var _binding: FragmentMediaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMediaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Set up media controls
        binding.playButton.setOnClickListener {
            // Logic to start media playback
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
