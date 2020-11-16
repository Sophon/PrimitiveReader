package com.example.library.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.library.R
import com.example.library.databinding.FragmentLibraryBinding

class LibraryFragment: Fragment() {

    private lateinit var binding: FragmentLibraryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLibraryBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {
        fun getInstance(): LibraryFragment {
            return LibraryFragment()
        }
    }
}