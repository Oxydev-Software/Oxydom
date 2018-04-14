package application.impl

import application.ClientApplication
import domain.model.client.Client
import domain.model.client.repository.ClientRepository
import java.util.*
import javax.inject.Inject

class ClientApplicationImpl : ClientApplication{
    @Inject
    lateinit var clientRepository: ClientRepository

    override fun retrieveById(idClient: Int) : Optional<Client>{
         val client = clientRepository.retrieveById(idClient);
        return client
    }

    override fun retrieveList() {
        val clients = clientRepository.retrieveList();
        return clients
    }

    override fun update(idClient: Int,  command : ClientCommand)  : Client{
        var client  = clientRepository.safeRetrieveById(idClient)
        client.change(command)
        val clientUpdated  = clientRepository.update(client)
        return clientUpdated
    }


}