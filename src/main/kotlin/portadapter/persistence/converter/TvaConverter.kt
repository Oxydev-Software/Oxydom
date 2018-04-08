package portadapter.persistence.converter

import domain.model.projet.Projet
import domain.model.tva.Tva
import portadapter.persistence.entity.EProjet
import portadapter.persistence.entity.ETva
import java.util.*
import java.util.stream.Collectors

class TvaConverter {
    //TODO
    fun fromModelToEntity(tva: Tva): Optional<ETva> {
        return Optional.empty()
    }

    fun fromEntityToModel(eTva: ETva): Optional<Tva> {
        return Optional.empty()
    }

    fun fromEntitiesToModels(tvaEntities: List<ETva>): List<Tva> {
        if (tvaEntities.isEmpty()) {
            return emptyList()
        }

        val tvas = tvaEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Tva>::isPresent)
                .map(Optional<Tva>::get)
                .collect(Collectors.toList())
        return tvas
    }

    fun fromModelsToEntities(tvas: List<Tva>): List<ETva> {
        if (tvas.isEmpty()) {
            return emptyList()
        }

        val tvaEntities = tvas.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<ETva>::isPresent)
                .map(Optional<ETva>::get)
                .collect(Collectors.toList())

        return tvaEntities;
    }
}