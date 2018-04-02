package domainmodel.model.projet.repository

import domainmodel.model.projet.Projet

interface ProjetRepository {
    fun retrieveById (idModule: Int)
    fun retrieveList()
    fun update(projet : Projet)
}