package domainmodel.model.maquette.factory

import domainmodel.model.maquette.Maquette

interface MaquetteFactory {
    fun create(maquette: Maquette)
}