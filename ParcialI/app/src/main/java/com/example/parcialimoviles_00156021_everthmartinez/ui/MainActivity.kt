package com.example.parcialimoviles_00156021_everthmartinez.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parcialimoviles_00156021_everthmartinez.R
import com.example.parcialimoviles_00156021_everthmartinez.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}