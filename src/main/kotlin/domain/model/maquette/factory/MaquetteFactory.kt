package domain.model.maquette.factory

import domain.model.maquette.Maquette

interface MaquetteFactory {
    fun create(maquette: Maquette)
}