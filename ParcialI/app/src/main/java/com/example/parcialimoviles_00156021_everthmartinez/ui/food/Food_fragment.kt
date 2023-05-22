package com.example.parcialimoviles_00156021_everthmartinez.ui.food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.parcialimoviles_00156021_everthmartinez.R
import com.example.parcialimoviles_00156021_everthmartinez.databinding.FragmentFoodFragmentBinding
import com.example.parcialimoviles_00156021_everthmartinez.databinding.FragmentFoodsfragmentBinding
import com.example.parcialimoviles_00156021_everthmartinez.ui.food.viewmodel.FoodViewModel


class food_fragment : Fragment() {

    private val foodViewModel: FoodViewModel by activityViewModels {
        FoodViewModel.Factory
    }

    private lateinit var binding: FragmentFoodFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFoodFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
    }

    private fun setViewModel() {
        binding.viewmodel = foodViewModel
    }

}