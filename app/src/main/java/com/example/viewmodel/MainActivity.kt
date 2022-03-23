package com.example.viewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)



        val numero = binding.textResultado.text.toString().toInt()
        binding.textResultado.text = numero.toString()

        mainViewModel.numero.observe(this){
            binding.textResultado.text = it.toString()
        }

        binding.button.setOnClickListener {

            mainViewModel.numero.value = binding.textResultado.text.toString().toInt().plus(1)
            mainViewModel.textResult.value = mainViewModel.numero.value.toString()

        }

    }

}





