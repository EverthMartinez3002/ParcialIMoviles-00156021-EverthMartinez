package com.example.parcialimoviles_00156021_everthmartinez.ui.food.newfood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.parcialimoviles_00156021_everthmartinez.R
import com.example.parcialimoviles_00156021_everthmartinez.databinding.FragmentNewfoodFragmentBinding
import com.example.parcialimoviles_00156021_everthmartinez.ui.food.viewmodel.FoodViewModel


class newfood_fragment : Fragment() {

    private val foodViewModel: FoodViewModel by activityViewModels {
        FoodViewModel.Factory
    }

    private lateinit var binding: FragmentNewfoodFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNewfoodFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
        observeStatus()
    }

    private fun setViewModel() {
        binding.viewmodel = foodViewModel
    }

    private fun observeStatus() {
        foodViewModel.status.observe(viewLifecycleOwner) {status -> when {
            status.equals(FoodViewModel.WRONG_INFORMATION) -> {
                foodViewModel.clearStatus()
            }
            status.equals(FoodViewModel.FOOD_CREATED) -> {
                foodViewModel.clearStatus()
                findNavController().popBackStack()
            }
        }
    }
    }
}