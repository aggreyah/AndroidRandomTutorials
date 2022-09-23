package com.aggreyah.viewmodelintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.aggreyah.viewmodelintro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding.tvNumber.text = viewModel.number.toString()
        binding.btnAddOne.setOnClickListener {
            viewModel.addOne()
            binding.tvNumber.text = viewModel.number.toString()
        }
    }
}