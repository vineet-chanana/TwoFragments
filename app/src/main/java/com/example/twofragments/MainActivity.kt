package com.example.twofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Communicator{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.fragment_first,FragmentFirst(),"fragmentA").commit()
            supportFragmentManager.beginTransaction().add(R.id.fragment_second,FragmentSecond(),"fragmentB").commit()
        }

    }

    override fun changeBgColor() {

        val fragment2 = supportFragmentManager.findFragmentById(R.id.fragment_second) as? FragmentSecond

        fragment2?.updateBgColor()
    }
}