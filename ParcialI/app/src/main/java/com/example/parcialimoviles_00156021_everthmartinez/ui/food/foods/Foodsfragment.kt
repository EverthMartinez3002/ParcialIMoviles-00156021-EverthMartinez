package com.example.parcialimoviles_00156021_everthmartinez.ui.food.foods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcialimoviles_00156021_everthmartinez.R
import com.example.parcialimoviles_00156021_everthmartinez.data.model.FoodModel
import com.example.parcialimoviles_00156021_everthmartinez.databinding.FoodItemBinding
import com.example.parcialimoviles_00156021_everthmartinez.databinding.FragmentFoodsfragmentBinding
import com.example.parcialimoviles_00156021_everthmartinez.ui.food.foods.reclycerview.FoodRecycerViewAdapter
import com.example.parcialimoviles_00156021_everthmartinez.ui.food.viewmodel.FoodViewModel


class foodsfragment : Fragment() {

    private val foodViewModel: FoodViewModel by activityViewModels {
        FoodViewModel.Factory
    }

    private lateinit var adapter: FoodRecycerViewAdapter

    private lateinit var binding: FragmentFoodsfragmentBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragme
        binding = FragmentFoodsfragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView(view)

        binding.btnNavCreateNewFood.setOnClickListener{
            foodViewModel.clearData()
            it.findNavController().navigate(R.id.action_foodsfragment_to_newfood_fragment)
        }

    }

    private fun setRecyclerView(view: View) {
        binding.recyclerView.layoutManager = LinearLayoutManager(view.context)

        adapter = FoodRecycerViewAdapter { selectedFood ->
            showSelectedItem(selectedFood)
        }

        binding.recyclerView.adapter = adapter
        displayFoods()
    }

    private fun displayFoods() {
        adapter.setData(foodViewModel.getFoods())
        adapter.notifyDataSetChanged()
    }

    private fun showSelectedItem(food: FoodModel) {
        foodViewModel.setSelectedFood(food)
        findNavController().navigate(R.id.action_foodsfragment_to_food_fragment)
    }


}