package com.example.induztek_ingeniera.model

/**
 * Representa un ensayo sencillo registrado para un equipo.
 * La app guarda los datos ingresados; no declara si el equipo cumple una norma eléctrica.
 */
data class Prueba(
    val id: Long = 0,
    val tipoEquipo: String,
    val codigoEquipo: String,
    val tipoPrueba: String,
    val instalacion: String,
    val valorMedicion: Double,
    val unidadMedicion: String,
    val fechaHora: Long = System.currentTimeMillis(),
    val observaciones: String = ""
)
