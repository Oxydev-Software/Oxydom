package domain.model.client.repository

import dagger.Component
import domain.model.client.Client
import java.util.*

@Component
interface ClientRepository {
    fun retrieveById (idClient: Int) : Optional<Client>
    fun safeRetrieveById(idClient: Int) : Client
    fun retrieveList()
    fun update(client : Client) : Client
}