package fr.oxydom.application

import fr.oxydom.application.impl.ClientCommand
import fr.oxydom.model.client.Client
import java.util.*

interface ClientApplication {
    fun retrieveById(idClient : Int) : Optional<Client>
    fun retrieveList(): List<Client>
    fun update(idClient: Int, clientCommand : ClientCommand) : Client
}