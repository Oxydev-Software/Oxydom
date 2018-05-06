package fr.oxydom.model.maquette.repository

import fr.oxydom.model.maquette.Maquette

interface MaquetteRepository {
    fun retrieveById (idMaquette: Int)
    fun retrieveList()
    fun update(maquette: Maquette)
}