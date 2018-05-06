package fr.oxydom.portadapter.persistence.converter

import fr.oxydom.model.agence.Agence
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import fr.oxydom.portadapter.persistence.entity.EAgence
import java.util.*
import java.util.stream.Collectors

@Component
class AgenceConverter (val fournisseurConverter: FournisseurConverter){

    fun fromModelToEntity(agence: Agence): Optional<EAgence> {

        val agenceEntity = EAgence(
                agence.idAgence,
                agence.telephone,
                agence.codeAgence,
                agence.adresse,
                agence.ville,
                agence.pays,
                fournisseurConverter.fromModelsToEntities(agence.fournisseurs))

        return Optional.of(agenceEntity)
    }

    fun fromEntityToModel(eAgence: EAgence): Optional<Agence> {
        if (null == eAgence) {
            return Optional.empty();
        }
        val agence = Agence(eAgence.idAgence,
                eAgence.telephone,
                eAgence.codeAgence,
                eAgence.adresse,
                eAgence.ville,
                eAgence.pays,
                fournisseurConverter.fromEntitiesToModels(eAgence.efournisseurs))

        return Optional.of(agence);
    }

    fun fromEntitiesToModels(agenceEntities: List<EAgence>): List<Agence> {
        if (agenceEntities.isEmpty()) {
            return emptyList()
        }

        val agences = agenceEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Agence>::isPresent)
                .map(Optional<Agence>::get)
                .collect(Collectors.toList())
        return agences
    }

    fun fromModelsToEntities(agences: List<Agence>): List<EAgence> {
        if (agences.isEmpty()) {
            return emptyList()
        }

        val agenceEntities = agences.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EAgence>::isPresent)
                .map(Optional<EAgence>::get)
                .collect(Collectors.toList())

        return agenceEntities;
    }
}