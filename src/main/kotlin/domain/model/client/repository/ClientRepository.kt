package domain.model.client.repository

import domain.model.client.Client
import java.util.*

interface ClientRepository {
    fun retrieveById(idClient: Int): Optional<Client>
    fun safeRetrieveById(idClient: Int): Client
    fun retrieveList()
    fun update(client: Client): Client
}