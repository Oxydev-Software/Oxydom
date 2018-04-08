package domain.model.client.repository

import dagger.Component
import domain.model.client.Client
@Component
interface ClientRepository {
    fun retrieveById (idClient: Int)
    fun retrieveList()
    fun update(client : Client)
}