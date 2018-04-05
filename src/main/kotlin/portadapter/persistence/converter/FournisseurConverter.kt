package portadapter.persistence.converter

import dagger.Component
import domainmodel.model.fournisseur.Fournisseur
import portadapter.persistence.entity.EFournisseur
import java.util.*
import java.util.stream.Collectors
import javax.inject.Inject

@Component
class FournisseurConverter {

    fun fromDomainToEntity(fournisseur : Fournisseur) : Optional<EFournisseur>{
        if (null == fournisseur){
            return Optional.empty()
        }

        val entity = EFournisseur(
                fournisseur.idFournisseur,
                fournisseur.numeroSiret,
                fournisseur.nom,
                fournisseur.adresse,
                fournisseur.ville,
                fournisseur.pays,
                fournisseur.email,
                fournisseur.telephone)

        return Optional.of(entity)
    }

    fun fromEntityToDomain(eFournisseur: EFournisseur) : Optional<Fournisseur>{
        if(null == eFournisseur){
            return Optional.empty()
        }

        val model = Fournisseur(
                eFournisseur.idFournisseur,
                eFournisseur.numeroSiret,
                eFournisseur.nom,
                eFournisseur.adresse,
                eFournisseur.ville,
                eFournisseur.pays,
                eFournisseur.adresse,
                eFournisseur.telephone)

        return Optional.of(model)
    }

    fun fromModelsToEntities(fournisseurs : List<Fournisseur>) : List<EFournisseur>{
        if (fournisseurs.isEmpty()){
            return Arrays.asList()
        }

        val entities = fournisseurs
                .stream()
                .map(this::fromDomainToEntity)
                .filter(Optional<EFournisseur>::isPresent)
                .map(Optional<EFournisseur>::get)
                .collect(Collectors.toList())
        return entities
    }

    fun fromEntitiesToModel(efournisseurs : List<EFournisseur>) : List<Fournisseur>{
        if(efournisseurs.isEmpty()){
            return Arrays.asList()
        }

        val models = efournisseurs
                .stream()
                .map(this::fromEntityToDomain)
                .filter(Optional<Fournisseur>::isPresent)
                .map(Optional<Fournisseur>::get)
                .collect(Collectors.toList())

        return models
    }
}