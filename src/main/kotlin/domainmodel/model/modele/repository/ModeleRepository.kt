package domainmodel.model.modele.repository

import domainmodel.model.modele.Modele

interface ModeleRepository {
    fun retrieveById(idModele : Int)
    fun retrieveList()
    fun update(modele: Modele)
}