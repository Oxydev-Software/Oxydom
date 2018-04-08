package domain.model.gamme.repository

import dagger.Component
import domain.model.gamme.Gamme
@Component
interface GammeRepository {
    fun retrieveById (idGamme: Int)
    fun retrieveList()
    fun update(gamme : Gamme)
}