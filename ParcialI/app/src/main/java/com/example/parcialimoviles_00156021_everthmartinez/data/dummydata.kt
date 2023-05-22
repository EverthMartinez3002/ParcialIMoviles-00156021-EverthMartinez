package com.example.parcialimoviles_00156021_everthmartinez.data

import com.example.parcialimoviles_00156021_everthmartinez.data.model.FoodModel

//Food one data
val name = "Pupusas"
val type = "Tipica"
val description = "Es una comida muy rica"
val qualification = "9.8"

//Food two data
val name2 = "Pupusas"
val type2 = "Tipica"
val description2 = "Es una comida muy rica"
val qualification2 = "9.8"

var foods = mutableListOf(
    FoodModel(name, type, description, qualification),
    FoodModel(name2, type2, description2, qualification2)
)