package com.example.twofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentFirst : Fragment() {

    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)

        communicator = activity as Communicator

        val button: Button = view.findViewById(R.id.changeColorButton)

        button.setOnClickListener {
            communicator.changeBgColor()
        }
        return view
    }


}