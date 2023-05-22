package com.example.parcialimoviles_00156021_everthmartinez

import android.app.Application
import com.example.parcialimoviles_00156021_everthmartinez.data.foods
import com.example.parcialimoviles_00156021_everthmartinez.repositories.FoodRepository

class FoodReviewerApplication : Application() {
    val foodRepository: FoodRepository by lazy {
        FoodRepository(foods)
    }
}