package com.example.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout
import androidx.navigation.fragment.findNavController

class segundoFragmento : Fragment() {
    lateinit var boton:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_segundo_fragmento, container, false)
        boton = vista.findViewById(R.id.btn2)
        boton.setOnClickListener {
            findNavController().navigate(R.id.action_segundoFragmento_to_primerFragmento)
        }
        return vista
    }
}