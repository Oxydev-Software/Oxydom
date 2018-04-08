package domain.model.maquette.repository

import dagger.Component
import domain.model.maquette.Maquette
@Component
interface MaquetteRepository {
    fun retrieveById (idMaquette: Int)
    fun retrieveList()
    fun update(maquette: Maquette)
}