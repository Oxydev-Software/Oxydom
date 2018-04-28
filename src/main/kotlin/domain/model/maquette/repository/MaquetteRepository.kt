package domain.model.maquette.repository

import domain.model.maquette.Maquette

interface MaquetteRepository {
    fun retrieveById (idMaquette: Int)
    fun retrieveList()
    fun update(maquette: Maquette)
}