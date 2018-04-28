package application.addingclient

import domain.model.client.Client
import domain.model.client.factory.ClientFactory
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