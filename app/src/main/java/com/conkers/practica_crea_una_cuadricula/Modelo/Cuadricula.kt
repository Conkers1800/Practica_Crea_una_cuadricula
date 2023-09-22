package com.conkers.practica_crea_una_cuadricula.Modelo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cuadricula(
    @StringRes val nombre: Int,
    val cursosD: Int,
    @DrawableRes val imageRes: Int
)