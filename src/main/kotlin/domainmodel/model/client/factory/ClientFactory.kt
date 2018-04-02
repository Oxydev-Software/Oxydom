package domainmodel.model.client.factory

import domainmodel.model.client.Client

interface ClientFactory {
    fun create(client : Client)
}