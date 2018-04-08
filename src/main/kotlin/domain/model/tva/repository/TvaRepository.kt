package domain.model.tva.repository

import dagger.Component

@Component
interface TvaRepository {
    fun retrieveById (idTva: Int)
}