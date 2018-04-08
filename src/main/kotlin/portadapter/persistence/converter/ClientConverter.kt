package portadapter.persistence.converter

import domain.model.client.Client
import portadapter.persistence.entity.EClient
import java.util.*
import java.util.stream.Collectors
import javax.inject.Inject

class ClientConverter {

    @Inject
    lateinit var projetConverter: ProjetConverter

    fun fromModelToEntity(client: Client): Optional<EClient> {

        val clientEntity = EClient(
                client.idClient,
                client.prenom,
                client.nom,
                client.email,
                client.adresse,
                client.ville,
                client.pays,
                client.telephone,
                client.photo,
                client.civilite,
                projetConverter.fromModelsToEntities(client.projets))

        return Optional.of(clientEntity)
    }

    fun fromEntityToModel(eClient: EClient): Optional<Client> {
        if (null == eClient) {
            return Optional.empty();
        }
        val client = Client(
                eClient.idClient,
                eClient.prenom,
                eClient.nom,
                eClient.email,
                eClient.adresse,
                eClient.ville,
                eClient.pays,
                eClient.telephone,
                eClient.photo,
                eClient.civilite,
                projetConverter.fromEntitiesToModels(eClient.eprojets)
        )

        return Optional.of(client);
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