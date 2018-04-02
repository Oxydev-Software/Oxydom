package domainmodel.model.commercial.repository

interface CommercialRepository {
    fun retrieveById (idCommercial: Int)
    fun retrieveList()
}