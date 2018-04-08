package domain.model.commercial.repository

import dagger.Component

@Component
interface CommercialRepository {
    fun retrieveById (idCommercial: Int)
    fun retrieveList()
}