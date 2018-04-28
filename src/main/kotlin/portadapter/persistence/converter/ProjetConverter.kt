package portadapter.persistence.converter

import domain.model.projet.Projet
import portadapter.persistence.entity.EProjet
import java.util.*
import java.util.stream.Collectors

class ProjetConverter {

    lateinit var clientConverter: ClientConverter
    lateinit var interventionConverter: InterventionConverter
    lateinit var commercialConverter: CommercialConverter
    lateinit var maquetteConverter: MaquetteConverter

    fun fromModelToEntity(projet: Projet): Optional<EProjet> {

        val projetEntity = EProjet(
                projet.idProjet,
                projet.libelleProjet,
                projet.codeProjet,
                projet.statutProjet,
                clientConverter.fromModelToEntity(projet.client).orElse(null),
                interventionConverter.fromModelsToEntities(projet.interventions),
                commercialConverter.fromModelToEntity(projet.commercial).orElse(null),
                maquetteConverter.fromModelsToEntities(projet.maquettes))

        return Optional.of(projetEntity)
    }

    fun fromEntityToModel(eProjet: EProjet): Optional<Projet> {
        if (null == eProjet) {
            return Optional.empty();
        }
        val projet = Projet(
                eProjet.idProjet,
                eProjet.libelleProjet,
                eProjet.codeProjet,
                eProjet.statutProjet,
                clientConverter.fromEntityToModel(eProjet.eclient).orElse(null),
                interventionConverter.fromEntitiesToModels(eProjet.einterventions),
                commercialConverter.fromEntityToModel(eProjet.ecommercial).orElse(null),
                maquetteConverter.fromEntitiesToModels(eProjet.emaquettes)
        )

        return Optional.of(projet);
    }

    fun fromEntitiesToModels(projetEntities: List<EProjet>): List<Projet> {
        if (projetEntities.isEmpty()) {
            return emptyList()
        }

        val projets = projetEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Projet>::isPresent)
                .map(Optional<Projet>::get)
                .collect(Collectors.toList())
        return projets
    }

    fun fromModelsToEntities(projets: List<Projet>): List<EProjet> {
        if (projets.isEmpty()) {
            return emptyList()
        }

        val projetEntities = projets.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EProjet>::isPresent)
                .map(Optional<EProjet>::get)
                .collect(Collectors.toList())

        return projetEntities;
    }
}