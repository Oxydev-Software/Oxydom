package fr.oxydom.model.projet.repository

import fr.oxydom.model.projet.Projet

interface ProjetRepository {
    fun retrieveById (idModule: Int)
    fun retrieveList()
    fun update(projet : Projet)
}