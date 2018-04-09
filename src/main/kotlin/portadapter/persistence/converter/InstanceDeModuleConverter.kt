package portadapter.persistence.converter

import domain.model.instancedemodule.InstanceDeModule
import portadapter.persistence.entity.EInstanceDeModule
import java.util.*
import java.util.stream.Collectors
import javax.inject.Inject

class InstanceDeModuleConverter {
    @Inject
    lateinit var categorieConverter : CategorieConverter
    @Inject
    lateinit var gammeConverter : GammeConverter

    fun fromModelToEntity(instanceDeModule: InstanceDeModule): Optional<EInstanceDeModule> {
        if(null == instanceDeModule){
            return Optional.empty()
        }

        val entity = EInstanceDeModule(
                instanceDeModule.idInstanceDeModule,
                instanceDeModule.libelleModule,
                instanceDeModule.prix,
                instanceDeModule.longueur,
                instanceDeModule.largeur,
                instanceDeModule.epaisseur,
                instanceDeModule.commentaire,
                categorieConverter.fromModelToEntity(instanceDeModule.categorie).orElse(null),
                instanceDeModule.valide,
                gammeConverter.fromModelToEntity(instanceDeModule.gamme).orElse(null),
                instanceDeModule.coordonneesX,
                instanceDeModule.coordonneesY,
                instanceDeModule.orientation
        )
        return Optional.of(entity)
    }

    fun fromEntityToModel(eInstanceDeModule: EInstanceDeModule): Optional<InstanceDeModule> {
        if(null == eInstanceDeModule){
            return Optional.empty();
        }

        val model = InstanceDeModule(

                eInstanceDeModule.idInstanceDeModule,
                eInstanceDeModule.libelleModule,
                eInstanceDeModule.prix,
                eInstanceDeModule.longueur,
                eInstanceDeModule.largeur,
                eInstanceDeModule.epaisseur,
                eInstanceDeModule.commentaire,
                categorieConverter.fromEntityToModel(eInstanceDeModule.ecategorie).orElse(null),
                eInstanceDeModule.valide,
                gammeConverter.fromEntityToModel(eInstanceDeModule.egamme).orElse(null),
                eInstanceDeModule.coordonneesX,
                eInstanceDeModule.coordonneesY,
                eInstanceDeModule.orientation
        )
        return Optional.of(model)
    }

    fun fromEntitiesToModels(instanceDeModuleEntities: List<EInstanceDeModule>): List<InstanceDeModule> {
        if (instanceDeModuleEntities.isEmpty()) {
            return emptyList()
        }

        val instanceDeModules = instanceDeModuleEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<InstanceDeModule>::isPresent)
                .map(Optional<InstanceDeModule>::get)
                .collect(Collectors.toList())
        return instanceDeModules
    }

    fun fromModelsToEntities(instanceDeModules: List<InstanceDeModule>): List<EInstanceDeModule> {
        if (instanceDeModules.isEmpty()) {
            return emptyList()
        }

        val instanceDeModuleEntities = instanceDeModules.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EInstanceDeModule>::isPresent)
                .map(Optional<EInstanceDeModule>::get)
                .collect(Collectors.toList())

        return instanceDeModuleEntities;
    }
}