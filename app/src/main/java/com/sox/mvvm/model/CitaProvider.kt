package com.sox.mvvm.model

class CitaProvider {
    companion object
    {

        fun random():CitaModel{
            val position =(0..10).random()
            return  citas[position]
        }
        private val citas= listOf<CitaModel>(
            CitaModel(
                cita = "C1",
                autor = "A1"
            ),
            CitaModel(
                cita = "C2",
                autor = "A2"
            ),
            CitaModel(
                cita = "C3",
                autor = "A3"
            ),
            CitaModel(
                cita = "C4",
                autor = "A4"
            ),
            CitaModel(
                cita = "C5",
                autor = "A5"
            ),
            CitaModel(
                cita = "C6",
                autor = "A6"
            ),
            CitaModel(
                cita = "C7",
                autor = "A7"
            ),
            CitaModel(
                cita = "C8",
                autor = "A8"
            ),
            CitaModel(
                cita = "C9",
                autor = "A9"
            ),
            CitaModel(
                cita = "C10",
                autor = "A10"
            ),
        )
    }
}