package fr.oxydom.portadapter.persistence.factory

import fr.oxydom.model.client.Client
import fr.oxydom.model.client.factory.ClientFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import fr.oxydom.portadapter.persistence.converter.ClientConverter
import fr.oxydom.portadapter.persistence.mapper.ClientMapper

@Component
class ClientFactoryImpl : ClientFactory {
    @Autowired
    lateinit var clientConverter : ClientConverter

    @Autowired
    lateinit var clientMapper: ClientMapper

    override fun create(client: Client) {
        val eClient = clientConverter.fromModelToEntity(client).get()

        clientMapper.create(eClient)
    }
}