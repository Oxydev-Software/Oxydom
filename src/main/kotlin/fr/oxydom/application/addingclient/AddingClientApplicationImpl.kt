package fr.oxydom.application.addingclient

import fr.oxydom.model.client.Client
import fr.oxydom.model.client.factory.ClientFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AddingClientApplicationImpl : AddingClientApplication {
    @Autowired
    lateinit var clientFactory: ClientFactory

    override fun performBusinessProcess(command: AddingClientCommand) {
        val client = Client(
                null,
                command.prenom,
                command.nom,
                command.email,
                command.adresse,
                command.ville,
                command.pays,
                command.telephone,
                command.photo,
                command.civilite,
                command.projets
        )
        return clientFactory.create(client)
    }
}