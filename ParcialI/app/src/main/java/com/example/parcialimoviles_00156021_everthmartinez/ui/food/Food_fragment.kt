package com.example.parcialimoviles_00156021_everthmartinez.ui.food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.parcialimoviles_00156021_everthmartinez.R

/**
 * A simple [Fragment] subclass.
 * Use the [food_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class food_fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food_fragment, container, false)
    }
    
}