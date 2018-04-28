package domain.model.commercial.repository

interface CommercialRepository {
    fun retrieveById (idCommercial: Int)
    fun retrieveList()
}