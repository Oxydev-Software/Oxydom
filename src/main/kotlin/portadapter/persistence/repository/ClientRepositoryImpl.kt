package portadapter.persistence.repository

import domain.model.client.Client
import domain.model.client.repository.ClientRepository
import portadapter.persistence.converter.ClientConverter
import portadapter.persistence.entity.EClient
import portadapter.persistence.mapper.ClientMapper
import java.util.*
import javax.inject.Inject

class ClientRepositoryImpl : ClientRepository {
    @Inject
    lateinit var clientMapper: ClientMapper
    @Inject
    lateinit var clientConverter: ClientConverter

    override fun safeRetrieveById(idClient: Int): Client {
        val client = clientConverter.fromEntityToModel(internalRetrieveEntity(idClient).get()).get()
        assertIsPresent(client)
        return client
    }

    override fun retrieveById(idClient: Int) : Optional<Client>{
        return clientConverter.fromEntityToModel(internalRetrieveEntity(idClient).orElse(null))
    }

    override fun retrieveList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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