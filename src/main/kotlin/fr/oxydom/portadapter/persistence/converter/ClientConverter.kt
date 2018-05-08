package fr.oxydom.portadapter.persistence.converter

import fr.oxydom.model.client.Client
import org.springframework.stereotype.Component
import fr.oxydom.portadapter.persistence.entity.EClient
import java.util.*
import java.util.stream.Collectors

@Component
class ClientConverter  {

    fun fromModelToEntity(client: Client): Optional<EClient> {

        val clientEntity = EClient(
                client.id,
                client.prenom,
                client.nom,
                client.email,
                client.adresse,
                client.ville,
                client.pays,
                client.telephone,
                client.photo,
                client.civilite)

        return Optional.of(clientEntity)
    }

    fun fromEntityToModel(eClient: EClient): Optional<Client> {
        if (null == eClient) {
            return Optional.empty()
        }
        val client = Client(
                eClient.id,
                eClient.prenom!!,
                eClient.nom!!,
                eClient.email!!,
                eClient.adresse!!,
                eClient.ville!!,
                eClient.pays!!,
                eClient.telephone!!,
                eClient.photo,
                eClient.civilite!!)

        return Optional.of(client)
    }

    fun fromEntitiesToModels(clientEntities: List<EClient>): List<Client> {
        if (clientEntities.isEmpty()) {
            return emptyList()
        }

        val clients = clientEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Client>::isPresent)
                .map(Optional<Client>::get)
                .collect(Collectors.toList())
        return clients
    }

    fun fromModelsToEntities(clients: List<Client>): List<EClient> {
        if (clients.isEmpty()) {
            return emptyList()
        }

        val clientEntities = clients.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EClient>::isPresent)
                .map(Optional<EClient>::get)
                .collect(Collectors.toList())

        return clientEntities;
    }
}