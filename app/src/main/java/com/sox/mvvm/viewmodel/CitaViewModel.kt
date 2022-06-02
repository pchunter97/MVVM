package com.sox.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sox.mvvm.model.CitaModel
import com.sox.mvvm.model.CitaProvider

class CitaViewModel:ViewModel() {
    val citaModel = MutableLiveData<CitaModel>()
    fun randomCita()
    {
        val currentCita: CitaModel = CitaProvider.random()
        citaModel.postValue(currentCita)
    }
}