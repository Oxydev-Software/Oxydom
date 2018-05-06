package fr.oxydom.application.impl

import fr.oxydom.application.ClientApplication
import fr.oxydom.model.client.Client
import fr.oxydom.model.client.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class ClientApplicationImpl : ClientApplication{
    @Autowired
    lateinit var clientRepository: ClientRepository

    override fun retrieveById(idClient: Int) : Optional<Client>{
        return clientRepository.retrieveById(idClient)
    }

    override fun retrieveList() {
        return clientRepository.retrieveList();
    }

    override fun update(idClient: Int, clientCommand : ClientCommand)  : Client{
        val client  = clientRepository.safeRetrieveById(idClient)
        val clientToUpdateWith = Client(
                clientCommand.idClient,
                clientCommand.prenom,
                clientCommand.nom,
                clientCommand.email,
                clientCommand.adresse,
                clientCommand.ville,
                clientCommand.pays,
                clientCommand.telephone,
                clientCommand.photo,
                clientCommand.civilite,
                clientCommand.projets)

        client.change(clientToUpdateWith)
        return clientRepository.update(client)
    }


}