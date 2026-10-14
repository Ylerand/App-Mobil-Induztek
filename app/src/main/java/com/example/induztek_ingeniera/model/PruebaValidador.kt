package com.example.induztek_ingeniera.model

/** Reúne las reglas sencillas para aceptar o rechazar un formulario. */
object PruebaValidador {

    /** Comprueba que los datos necesarios estén presentes y que la medición sea numérica. */
    fun validar(estado: PruebaUiState): PruebaErrores {
        val medicion = convertirMedicion(estado.valorMedicion)
        return PruebaErrores(
            tipoEquipo = if (estado.tipoEquipo.isBlank()) "Escribe el tipo de equipo" else null,
            codigoEquipo = if (estado.codigoEquipo.isBlank()) "Escribe el código del equipo" else null,
            tipoPrueba = if (estado.tipoPrueba.isBlank()) "Escribe el tipo de ensayo" else null,
            instalacion = if (estado.instalacion.isBlank()) "Escribe la instalación" else null,
            valorMedicion = if (medicion == null) "Escribe un número válido" else null,
            unidadMedicion = if (estado.unidadMedicion.isBlank()) "Escribe la unidad" else null
        )
    }

    /** Acepta coma o punto decimal, pero rechaza texto y valores infinitos. */
    fun convertirMedicion(texto: String): Double? = texto.trim()
        .replace(',', '.')
        .toDoubleOrNull()
        ?.takeIf { it.isFinite() }
}
