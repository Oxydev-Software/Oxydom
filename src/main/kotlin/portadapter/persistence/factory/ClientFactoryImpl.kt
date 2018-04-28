package portadapter.persistence.factory

import domain.model.client.Client
import domain.model.client.factory.ClientFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import portadapter.persistence.converter.ClientConverter
import portadapter.persistence.mapper.ClientMapper

@Component
class ClientFactoryImpl @Autowired constructor(var clientConverter : ClientConverter, var clientMapper : ClientMapper) : ClientFactory {

    override fun create(client: Client) {
        val eClient = clientConverter.fromModelToEntity(client).get()

        clientMapper.create(eClient)
    }
}