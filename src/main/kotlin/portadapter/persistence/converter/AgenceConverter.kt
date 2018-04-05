package portadapter.persistence.converter

import dagger.Component
import domainmodel.model.agence.Agence
import portadapter.persistence.entity.EAgence
import java.util.*
import java.util.stream.Collectors
import javax.inject.Inject

@Component
class AgenceConverter {
    @Inject
    lateinit var fournisseurConverter : FournisseurConverter
    fun fromModelToEntity(agence : Agence) : Optional<EAgence> {

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

    fun fromEntityToModel(eAgence : EAgence) : Optional<Agence> {
        if (null == eAgence){
            return Optional.empty();
        }
        val agence = Agence(eAgence.idAgence,
                eAgence.telephone,
                eAgence.codeAgence,
                eAgence.adresse,
                eAgence.ville,
                eAgence.pays,
                fournisseurConverter.fromEntitiesToModel(eAgence.efournisseurs))

        return Optional.of(agence);
    }

    fun fromEntitiesToModels(agenceEntities : List<EAgence>) : List<Agence>{
        if (agenceEntities.isEmpty()){
            return Arrays.asList();
        }

        val agences = agenceEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Agence>::isPresent)
                .map(Optional<Agence>::get)
                .collect(Collectors.toList())
        return agences
    }
}