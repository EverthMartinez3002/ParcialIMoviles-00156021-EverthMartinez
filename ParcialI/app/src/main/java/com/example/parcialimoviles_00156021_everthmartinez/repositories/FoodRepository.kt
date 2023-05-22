package com.example.parcialimoviles_00156021_everthmartinez.repositories

import com.example.parcialimoviles_00156021_everthmartinez.data.model.FoodModel

class FoodRepository (private val foods: MutableList<FoodModel>)  {
    fun getFoods() = foods

    fun addFoods(food: FoodModel) = foods.add(food)

}