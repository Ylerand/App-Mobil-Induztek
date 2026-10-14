package com.example.induztek_ingeniera.model

/** Guarda el mensaje de error de cada campo del formulario, si existe. */
data class PruebaErrores(
    val tipoEquipo: String? = null,
    val codigoEquipo: String? = null,
    val tipoPrueba: String? = null,
    val instalacion: String? = null,
    val valorMedicion: String? = null,
    val unidadMedicion: String? = null
) {
    /** El botón Guardar solo debe continuar cuando no haya errores. */
    fun hayErrores(): Boolean = listOf(
        tipoEquipo, codigoEquipo, tipoPrueba, instalacion, valorMedicion, unidadMedicion
    ).any { it != null }
}
