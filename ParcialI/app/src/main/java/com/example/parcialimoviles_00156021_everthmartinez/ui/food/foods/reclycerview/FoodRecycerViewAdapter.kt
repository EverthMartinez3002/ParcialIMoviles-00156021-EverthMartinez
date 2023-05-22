package com.example.parcialimoviles_00156021_everthmartinez.ui.food.foods.reclycerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialimoviles_00156021_everthmartinez.data.model.FoodModel
import com.example.parcialimoviles_00156021_everthmartinez.databinding.FoodItemBinding

class FoodRecycerViewAdapter(
    private val clickListener: (FoodModel) -> Unit
) : RecyclerView.Adapter<FoodRecycerViewHolder>() {
    private val foods = ArrayList<FoodModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodRecycerViewHolder {
        val binding = FoodItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodRecycerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return foods.size
    }

    override fun onBindViewHolder(holder: FoodRecycerViewHolder, position: Int) {
        val food = foods[position]
        holder.bind(food, clickListener)
    }

    fun setData(foodsList: List<FoodModel>) {
        foods.clear()
        foods.addAll(foodsList)
    }



}