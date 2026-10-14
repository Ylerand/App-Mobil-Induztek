package com.example.induztek_ingeniera.model

/** Contiene dos mediciones comparables; la diferencia se calcula sin juzgar conformidad. */
data class ComparacionPruebas(
    val actual: Prueba,
    val anterior: Prueba
) {
    /** Resultado actual menos resultado anterior, expresado en la unidad registrada. */
    val diferencia: Double
        get() = actual.valorMedicion - anterior.valorMedicion

    companion object {
        /** Busca el registro previo del mismo equipo, ensayo y unidad. */
        fun buscar(pruebas: List<Prueba>, actual: Prueba): ComparacionPruebas? {
            val anterior = pruebas
                .filter {
                    it.id != actual.id &&
                            it.codigoEquipo == actual.codigoEquipo &&
                            it.tipoPrueba == actual.tipoPrueba &&
                            it.unidadMedicion == actual.unidadMedicion
                }
                .maxByOrNull { it.fechaHora }
                ?: return null

            return ComparacionPruebas(actual = actual, anterior = anterior)
        }
    }
}
