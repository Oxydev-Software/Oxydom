package portadapter.persistence.converter

import domain.model.modele.Modele
import portadapter.persistence.entity.EModele
import java.util.*
import java.util.stream.Collectors

class ModeleConverter {

    lateinit var moduleConverter : ModuleConverter

    fun fromModelToEntity(modele: Modele): Optional<EModele> {
        if (null == modele){
            return Optional.empty()
        }
        val entity  = EModele(
                modele.idModele,
                modele.libelleModele,
                modele.prix,
                moduleConverter.fromModelsToEntities(modele.modules)
        )
        return Optional.of(entity)
    }

    fun fromEntityToModel(eModele: EModele): Optional<Modele> {
        if(null == eModele){
            return Optional.empty()
        }
        val model = Modele(
                eModele.idModele,
                eModele.libelleModele,
                eModele.prix,
                moduleConverter.fromEntitiesToModels(eModele.eModules)
        )
        return Optional.of(model)
    }

    fun fromEntitiesToModels(modeleEntities: List<EModele>): List<Modele> {
        if (modeleEntities.isEmpty()) {
            return emptyList()
        }

        val modeles = modeleEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Modele>::isPresent)
                .map(Optional<Modele>::get)
                .collect(Collectors.toList())
        return modeles
    }

    fun fromModelsToEntities(modeles: List<Modele>): List<EModele> {
        if (modeles.isEmpty()) {
            return emptyList()
        }

        val modeleEntities = modeles.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EModele>::isPresent)
                .map(Optional<EModele>::get)
                .collect(Collectors.toList())

        return modeleEntities;
    }
}