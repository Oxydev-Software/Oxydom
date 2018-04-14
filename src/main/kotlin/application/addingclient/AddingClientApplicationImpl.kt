package application.addingclient

import domain.model.client.factory.ClientFactory
import javax.inject.Inject

class AddingClientApplicationImpl : AddingClientApplication{
    @Inject
    lateinit var clientFactory :  ClientFactory

    override fun performBusinessProcess(command: AddingClientCommand) {
        val client = command.client

        return clientFactory.create(client)
    }
}