package fr.oxydom.model.client.repository

import fr.oxydom.model.client.Client
import java.util.*

interface ClientRepository {
    fun retrieveById(idClient: Int): Optional<Client>
    fun safeRetrieveById(idClient: Int): Client
    fun retrieveList()
    fun update(client: Client): Client
}