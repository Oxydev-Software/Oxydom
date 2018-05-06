package fr.oxydom.model.modele.repository

import fr.oxydom.model.modele.Modele

interface ModeleRepository {
    fun retrieveById(idModele : Int)
    fun retrieveList()
    fun update(modele: Modele)
}