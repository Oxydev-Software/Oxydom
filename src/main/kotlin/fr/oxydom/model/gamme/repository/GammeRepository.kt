package fr.oxydom.model.gamme.repository

import fr.oxydom.model.gamme.Gamme

interface GammeRepository {
    fun retrieveById (idGamme: Int)
    fun retrieveList()
    fun update(gamme : Gamme)
}