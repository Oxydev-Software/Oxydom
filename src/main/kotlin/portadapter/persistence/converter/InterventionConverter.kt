package portadapter.persistence.converter

import domain.model.intervention.Intervention
import portadapter.persistence.entity.EIntervention
import java.util.*
import java.util.stream.Collectors
import javax.inject.Inject

class InterventionConverter {
    //TODO
    @Inject
    lateinit var commercialConverter: CommercialConverter
    @Inject
    lateinit var projetConverter: ProjetConverter

    fun fromModelToEntity(intervention: Intervention): Optional<EIntervention> {

        val interventionEntities = EIntervention(
                intervention.idIntervention,
                intervention.dateIntervention,
                commercialConverter.fromModelToEntity(intervention.commercial).orElse(null),
                projetConverter.fromModelToEntity(intervention.projet).orElse(null))

        return Optional.of(interventionEntities)
    }

    fun fromEntityToModel(eIntervention: EIntervention): Optional<Intervention> {
        if (null == eIntervention) {
            return Optional.empty();
        }
        val intervention = Intervention(
                eIntervention.idIntervention,
                eIntervention.dateIntervention,
                commercialConverter.fromEntityToModel(eIntervention.ecommercial).orElse(null),
                projetConverter.fromEntityToModel(eIntervention.eprojet).orElse(null)
        )

        return Optional.of(intervention);
    }

    fun fromEntitiesToModels(interventionEntities: List<EIntervention>): List<Intervention> {
        if (interventionEntities.isEmpty()) {
            return emptyList()
        }

        val interventions = interventionEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Intervention>::isPresent)
                .map(Optional<Intervention>::get)
                .collect(Collectors.toList())
        return interventions
    }

    fun fromModelsToEntities(interventions: List<Intervention>): List<EIntervention> {
        if (interventions.isEmpty()) {
            return emptyList()
        }

        val interventionEntities = interventions.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EIntervention>::isPresent)
                .map(Optional<EIntervention>::get)
                .collect(Collectors.toList())

        return interventionEntities;
    }
}