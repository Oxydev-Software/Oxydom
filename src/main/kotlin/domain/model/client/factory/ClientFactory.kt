package domain.model.client.factory

import dagger.Component
import domain.model.client.Client
@Component
interface ClientFactory {
    fun create(client : Client)
}