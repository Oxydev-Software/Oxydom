package application.addingclient

import domain.model.client.Client

data class AddingClientCommand (
        val client  : Client
){

}