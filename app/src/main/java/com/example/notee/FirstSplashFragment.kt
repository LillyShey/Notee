package com.example.notee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstSplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_splash, container, false)
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).navController.navigate(R.id.action_firstSplashFragment_to_secondSplashFragment)
    }
}