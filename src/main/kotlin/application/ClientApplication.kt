package application

import application.impl.ClientCommand
import domain.model.client.Client
import java.util.*

interface ClientApplication {
    fun retrieveById(idClient : Int) : Optional<Client>
    fun retrieveList()
    fun update(idClient: Int, clientCommand : ClientCommand) : Client
}