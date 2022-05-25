package com.example.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class primerFragmento : Fragment() {
    lateinit var boton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_primer_fragmento, container, false)
        boton = vista.findViewById(R.id.btn1)
        boton.setOnClickListener {
            findNavController().navigate(R.id.action_primerFragmento_to_segundoFragmento)
        }
        return vista
    }
}