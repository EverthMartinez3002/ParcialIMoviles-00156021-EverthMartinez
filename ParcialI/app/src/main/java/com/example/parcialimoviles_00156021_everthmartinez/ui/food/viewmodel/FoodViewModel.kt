package com.example.parcialimoviles_00156021_everthmartinez.ui.food.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.parcialimoviles_00156021_everthmartinez.FoodReviewerApplication
import com.example.parcialimoviles_00156021_everthmartinez.data.model.FoodModel
import com.example.parcialimoviles_00156021_everthmartinez.data.qualification
import com.example.parcialimoviles_00156021_everthmartinez.data.qualification2
import com.example.parcialimoviles_00156021_everthmartinez.repositories.FoodRepository

class FoodViewModel(private val repository: FoodRepository) : ViewModel() {
    var name = MutableLiveData("")
    var type = MutableLiveData("")
    var description = MutableLiveData("")
    var qualification = MutableLiveData("")
    var status = MutableLiveData("")

    fun getFoods() = repository.getFoods()

    private fun addFoods(food: FoodModel) = repository.addFoods(food)

    fun createFood() {
        if (!validateData()) {
            status.value = WRONG_INFORMATION
            return
        }

        val food = FoodModel(
            name.value!!,
            type.value!!,
            description.value!!,
            qualification.value!!,
        )

        addFoods(food)
        clearData()

        status.value = FOOD_CREATED
    }

    private fun validateData(): Boolean {
        when {
            name.value.isNullOrEmpty() -> return false
            type.value.isNullOrEmpty() -> return false
            description.value.isNullOrEmpty() -> return false
            qualification.value.isNullOrEmpty() -> return false
        }
        return true
    }

    fun clearData() {
        name.value = ""
        type.value = ""
        description.value = ""
        qualification.value = ""
    }

    fun clearStatus() {
        status.value = INACTIVE
    }

    fun setSelectedFood(food: FoodModel) {
        name.value = food.name
        type.value = food.type
        description.value = food.description
        qualification.value = food.qualification
    }


    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as FoodReviewerApplication
                FoodViewModel(app.foodRepository)
            }
        }

        const val FOOD_CREATED = "Food created"
        const val WRONG_INFORMATION = "Wrong information"
        const val INACTIVE = ""
    }


}



