package domain.model.client.factory

import domain.model.client.Client

interface ClientFactory {
    fun create(client : Client)
}