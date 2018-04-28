package domain.model.projet.repository

import domain.model.projet.Projet

interface ProjetRepository {
    fun retrieveById (idModule: Int)
    fun retrieveList()
    fun update(projet : Projet)
}