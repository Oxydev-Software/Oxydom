package domainmodel.model.maquette.repository

import domainmodel.model.maquette.Maquette

interface MaquetteRepository {
    fun retrieveById (idMaquette: Int)
    fun retrieveList()
    fun update(maquette: Maquette)
}