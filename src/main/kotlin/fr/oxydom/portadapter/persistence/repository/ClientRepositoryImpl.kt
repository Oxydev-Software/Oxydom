package fr.oxydom.portadapter.persistence.repository

import fr.oxydom.model.client.Client
import fr.oxydom.model.client.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import fr.oxydom.portadapter.persistence.converter.ClientConverter
import fr.oxydom.portadapter.persistence.entity.EClient
import fr.oxydom.portadapter.persistence.mapper.ClientMapper
import java.util.*

class ClientRepositoryImpl (@Autowired private val clientConverter : ClientConverter,@Autowired private val clientMapper: ClientMapper) : ClientRepository {

    override fun safeRetrieveById(idClient: Int): Client {
        val client = clientConverter.fromEntityToModel(internalRetrieveEntity(idClient).get()).get()
        assertIsPresent(client)
        return client
    }

    override fun retrieveById(idClient: Int) : Optional<Client>{
        return clientConverter.fromEntityToModel(internalRetrieveEntity(idClient).orElse(null))
    }

    override fun retrieveList(): List<Client> {
        return clientConverter.fromEntitiesToModels(clientMapper.retrieveList())
    }

    override fun update(client: Client) : Client{
        assertIsPresent(client)
        val eClient = clientConverter.fromModelToEntity(client)

        val rowUpdated = clientMapper.update(eClient.get())
        assertOneRowModified(rowUpdated)
        return client
    }

    fun assertIsPresent(client : Client){
        if(client == null){
            throw Exception("id doesn't match with any client")
        }
    }

    fun internalRetrieveEntity(idClient: Int) : Optional<EClient>{
        return clientMapper.retrieveById(idClient)
    }

    fun assertOneRowModified(row : Int){
        if (row != 1){
            throw Exception("could'nt update entity")
        }
    }
}