package domainmodel.model.client.repository

import domainmodel.model.client.Client

interface ClientRepository {
    fun retrieveById (idClient: Int)
    fun retrieveList()
    fun update(client :Client)
}