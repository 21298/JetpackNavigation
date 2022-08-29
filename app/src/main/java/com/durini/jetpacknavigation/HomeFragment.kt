package com.durini.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var textHome: TextView
    private lateinit var buttonLogin: TextView
    private lateinit var nSession: Button

    private val args: HomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textHome = view.findViewById(R.id.text_fragmentHome_data)
        buttonLogin = view.findViewById(R.id.button_homeFragment_login)
        nSession = view.findViewById(R.id.button_homeFragment_newsession)

        val email = args.email


        textHome.text = "$email"

        setListeners()
    }

    private fun setListeners() {
        buttonLogin.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            requireView().findNavController().navigate(action)
        }
        nSession.setOnClickListener{
            val action = HomeFragmentDirections.actionHomeFragmentToCreateUserFragment(
                email = "jcdurini@uvg.edu.gt"
            )

            requireView().findNavController().navigate(action)
        }
    }
}

