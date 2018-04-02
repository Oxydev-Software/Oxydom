package domainmodel.model.gamme.repository

import domainmodel.model.gamme.Gamme

interface GammeRepository {
    fun retrieveById (idGamme: Int)
    fun retrieveList()
    fun update(gamme : Gamme)
}