package portadapter.persistence.converter

import domain.model.module.Module
import portadapter.persistence.entity.EModule
import java.util.*
import java.util.stream.Collectors

class ModuleConverter {
    lateinit var categorieConverter : CategorieConverter
    lateinit var gammeConverter : GammeConverter

    fun fromModelToEntity(module: Module): Optional<EModule> {
        if(null == module){
            return Optional.empty()
        }

        val entity = EModule(
                module.idModule,
                module.libelleModule,
                module.prix,
                module.longueur,
                module.largeur,
                module.epaisseur,
                module.commentaire,
                categorieConverter.fromModelToEntity(module.categorie).orElse(null),
                module.valide,
                gammeConverter.fromModelToEntity(module.gamme).orElse(null)
        )
        return Optional.of(entity)
    }

    fun fromEntityToModel(eModule: EModule): Optional<Module> {
        if(null == eModule){
            return Optional.empty();
        }

        val model = Module(
                eModule.idModule,
                eModule.libelleModule,
                eModule.prix,
                eModule.longueur,
                eModule.largeur,
                eModule.epaisseur,
                eModule.commentaire,
                categorieConverter.fromEntityToModel(eModule.ecategorie).orElse(null),
                eModule.valide,
                gammeConverter.fromEntityToModel(eModule.egamme).orElse(null)
        )
        return Optional.of(model)
    }

    fun fromEntitiesToModels(instanceDeModuleEntities: List<EModule>): List<Module> {
        if (instanceDeModuleEntities.isEmpty()) {
            return emptyList()
        }

        val modules = instanceDeModuleEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Module>::isPresent)
                .map(Optional<Module>::get)
                .collect(Collectors.toList())
        return modules
    }

    fun fromModelsToEntities(modules: List<Module>): List<EModule> {
        if (modules.isEmpty()) {
            return emptyList()
        }

        val instanceDeModuleEntities = modules.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EModule>::isPresent)
                .map(Optional<EModule>::get)
                .collect(Collectors.toList())

        return instanceDeModuleEntities;
    }
}