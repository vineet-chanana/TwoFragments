package com.example.twofragments

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout


class FragmentSecond : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)

    }

    var isCyan:Boolean = false

    fun updateBgColor(){
        if(!isCyan) {
            view?.setBackgroundColor(Color.CYAN)
            isCyan = true
        }else{
            view?.setBackgroundColor(Color.WHITE)
            isCyan = false
        }
//        view?.findViewById<ConstraintLayout>(R.id.fragment_second)?.setBackgroundColor(Color.BLACK)
    }

}