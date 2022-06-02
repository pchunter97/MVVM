package com.sox.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.sox.mvvm.databinding.ActivityMainBinding
import com.sox.mvvm.viewmodel.CitaViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private  val citaViewModel: CitaViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        citaViewModel.citaModel.observe(this, Observer {
            binding.tvQuote.text = it.cita
            binding.tvAuthor.text = it.autor
        })

        binding.viewContainer.setOnClickListener{
            citaViewModel.randomCita()
        }
    }
}