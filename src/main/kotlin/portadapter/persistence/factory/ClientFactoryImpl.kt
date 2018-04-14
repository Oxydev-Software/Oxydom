package portadapter.persistence.factory

import dagger.Component
import domain.model.client.Client
import domain.model.client.factory.ClientFactory
import portadapter.persistence.converter.ClientConverter
import portadapter.persistence.mapper.ClientMapper
import javax.inject.Inject


class ClientFactoryImpl : ClientFactory {
    @Inject
    lateinit var clientConverter : ClientConverter
    @Inject
    lateinit var clientMapper : ClientMapper

    override fun create(client: Client) {
        val eClient = clientConverter.fromModelToEntity(client).get()

        clientMapper.create(eClient)
    }
}