package fr.oxydom.model.maquette.factory

import fr.oxydom.model.maquette.Maquette

interface MaquetteFactory {
    fun create(maquette: Maquette)
}