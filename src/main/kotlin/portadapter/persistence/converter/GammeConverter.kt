package portadapter.persistence.converter

import domain.model.gamme.Gamme
import domain.model.tva.Tva
import portadapter.persistence.entity.EGamme
import portadapter.persistence.entity.ETva
import java.util.*
import java.util.stream.Collectors

class GammeConverter {
    fun fromModelToEntity(gamme: Gamme): Optional<EGamme> {
        if (null == gamme){
            return Optional.empty()
        }
        val entity  = EGamme(
                gamme.idGamme,
                gamme.libelleGamme,
                gamme.bonusIndividuel,
                gamme.bonusSet
        )
        return Optional.of(entity)
    }

    fun fromEntityToModel(eGamme: EGamme): Optional<Gamme> {
        if(null == eGamme){
            return Optional.empty()
        }
        val model = Gamme(
                eGamme.idGamme,
                eGamme.libelleGamme,
                eGamme.bonusIndividuel,
                eGamme.bonusSet
        )
        return Optional.of(model)
    }

    fun fromEntitiesToModels(gammeEntities: List<EGamme>): List<Gamme> {
        if (gammeEntities.isEmpty()) {
            return emptyList()
        }

        val gammes = gammeEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Gamme>::isPresent)
                .map(Optional<Gamme>::get)
                .collect(Collectors.toList())
        return gammes
    }

    fun fromModelsToEntities(gammes: List<Gamme>): List<EGamme> {
        if (gammes.isEmpty()) {
            return emptyList()
        }

        val gammeEntities = gammes.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EGamme>::isPresent)
                .map(Optional<EGamme>::get)
                .collect(Collectors.toList())

        return gammeEntities;
    }
}