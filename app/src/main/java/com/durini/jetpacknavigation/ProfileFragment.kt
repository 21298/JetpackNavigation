package com.durini.jetpacknavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var buttonupdate: Button


    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonupdate = view.findViewById(R.id.actualizaresaonda)
        setListeners()
    }

    private fun setListeners() {
        buttonupdate.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
        }
    }
}


