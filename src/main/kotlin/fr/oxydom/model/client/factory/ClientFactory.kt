package fr.oxydom.model.client.factory

import fr.oxydom.model.client.Client

interface ClientFactory {
    fun create(client : Client)
}