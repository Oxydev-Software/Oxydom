package portadapter.persistence.converter

import domain.model.commercial.Commercial
import org.springframework.beans.factory.annotation.Autowired
import portadapter.persistence.entity.ECommercial
import java.util.*
import java.util.stream.Collectors

class CommercialConverter {
    @Autowired
    lateinit var agenceConverter: AgenceConverter
    @Autowired
    lateinit var projetConverter: ProjetConverter

    fun fromModelToEntity(commercial: Commercial): Optional<ECommercial> {

        val clientEntity = ECommercial(
                commercial.idCommercial,
                commercial.prenom,
                commercial.nom,
                commercial.email,
                commercial.codeCommercial,
                commercial.telephone,
                commercial.motDePasse,
                commercial.pourcentageCommission,
                agenceConverter.fromModelToEntity(commercial.agence).orElse(null),
                projetConverter.fromModelsToEntities(commercial.projets))

        return Optional.of(clientEntity)
    }

    fun fromEntityToModel(eCommercial: ECommercial): Optional<Commercial> {
        if (null == eCommercial) {
            return Optional.empty();
        }
        val commercial = Commercial(
                eCommercial.idCommercial,
                eCommercial.prenom,
                eCommercial.nom,
                eCommercial.email,
                eCommercial.codeCommercial,
                eCommercial.telephone,
                eCommercial.motDePasse,
                eCommercial.pourcentageCommission,
                agenceConverter.fromEntityToModel(eCommercial.eagence).orElse(null),
                projetConverter.fromEntitiesToModels(eCommercial.eprojets)
        )

        return Optional.of(commercial);
    }

    fun fromEntitiesToModels(commercialEntities: List<ECommercial>): List<Commercial> {
        if (commercialEntities.isEmpty()) {
            return emptyList()
        }

        val commercials = commercialEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Commercial>::isPresent)
                .map(Optional<Commercial>::get)
                .collect(Collectors.toList())
        return commercials
    }

    fun fromModelsToEntities(commercials: List<Commercial>): List<ECommercial> {
        if (commercials.isEmpty()) {
            return emptyList()
        }

        val commercialEntities = commercials.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<ECommercial>::isPresent)
                .map(Optional<ECommercial>::get)
                .collect(Collectors.toList())

        return commercialEntities;
    }
}