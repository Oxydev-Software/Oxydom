package application

import application.impl.ClientCommand
import dagger.Component
import domain.model.client.Client
import java.util.*

@Component
interface ClientApplication {
    fun retrieveById(idClient : Int) : Optional<Client>
    fun retrieveList()
    fun update(idClient: Int, clientCommand : ClientCommand) : Client
}