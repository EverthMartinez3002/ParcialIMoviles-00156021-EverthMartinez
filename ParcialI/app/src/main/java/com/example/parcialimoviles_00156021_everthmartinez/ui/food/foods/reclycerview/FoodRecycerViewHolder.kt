package com.example.parcialimoviles_00156021_everthmartinez.ui.food.foods.reclycerview

import androidx.recyclerview.widget.RecyclerView
import com.example.parcialimoviles_00156021_everthmartinez.data.model.FoodModel
import com.example.parcialimoviles_00156021_everthmartinez.databinding.FoodItemBinding


class FoodRecycerViewHolder(private val binding: FoodItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(food: FoodModel, clickListener: (FoodModel) -> Unit) {
        binding.titleTextView.text = food.name
        binding.qualificationTextView.text = food.qualification

        binding.foodItemCardView.setOnClickListener{
            clickListener(food)
        }
    }
}