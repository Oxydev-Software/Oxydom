package domain.model.modele.repository

import domain.model.modele.Modele

interface ModeleRepository {
    fun retrieveById(idModele : Int)
    fun retrieveList()
    fun update(modele: Modele)
}