package com.durini.jetpacknavigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout

class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var buttonLogin: Button
    private lateinit var buttonCreate: Button
    private lateinit var inputEmail: TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin = view.findViewById(R.id.button_loginFragment_home)
        buttonCreate = view.findViewById(R.id.button_loginFragment_create)
        inputEmail = view.findViewById(R.id.textInput_loginFragment_insertadress)
        setListeners()
    }

    private fun setListeners() {
        buttonLogin.setOnClickListener {

            val action = LoginFragmentDirections.actionLoginFragmentToCreateUserFragment(
                email = inputEmail.editText!!.text.toString(),
            )
            requireView().findNavController().navigate(action)
        }

        buttonCreate.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_loginFragment_to_createUserFragment)
        }
    }
}


