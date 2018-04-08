package domain.model.modele.repository

import dagger.Component
import domain.model.modele.Modele
@Component
interface ModeleRepository {
    fun retrieveById(idModele : Int)
    fun retrieveList()
    fun update(modele: Modele)
}