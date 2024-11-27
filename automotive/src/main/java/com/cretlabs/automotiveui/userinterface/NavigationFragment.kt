package com.cretlabs.automotiveui.userinterface


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mycompany.automotiveivi.databinding.FragmentNavigationBinding

class NavigationFragment : Fragment() {

    private var _binding: FragmentNavigationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNavigationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Initialize navigation display
        binding.mapView.text = "Map will be displayed here"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
