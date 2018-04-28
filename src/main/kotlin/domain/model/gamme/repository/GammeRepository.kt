package domain.model.gamme.repository

import domain.model.gamme.Gamme

interface GammeRepository {
    fun retrieveById (idGamme: Int)
    fun retrieveList()
    fun update(gamme : Gamme)
}