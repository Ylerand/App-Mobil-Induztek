package com.example.induztek_ingeniera.model

/**
 * Estado que la pantalla muestra en cada momento: texto escrito, errores,
 * registros cargados y resultado del guardado.
 */
data class PruebaUiState(
    val tipoEquipo: String = "",
    val codigoEquipo: String = "",
    val tipoPrueba: String = "",
    val instalacion: String = "",
    val valorMedicion: String = "",
    val unidadMedicion: String = "",
    val observaciones: String = "",
    val errores: PruebaErrores = PruebaErrores(),
    val pruebas: List<Prueba> = emptyList(),
    val cargando: Boolean = true,
    val guardando: Boolean = false,
    val registroIdGuardado: Long? = null,
    val mensaje: String? = null
)
