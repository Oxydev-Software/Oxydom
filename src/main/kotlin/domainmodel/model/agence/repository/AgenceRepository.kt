package domainmodel.model.agence.repository

interface AgenceRepository {
    fun retrieveById (idAgence: Int)
    fun retrieveList()
}