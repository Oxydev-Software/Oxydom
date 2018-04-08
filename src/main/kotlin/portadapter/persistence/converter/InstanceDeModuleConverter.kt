package portadapter.persistence.converter

import domain.model.instancedemodule.InstanceDeModule
import domain.model.tva.Tva
import portadapter.persistence.entity.EInstanceDeModule
import portadapter.persistence.entity.ETva
import java.util.*
import java.util.stream.Collectors

class InstanceDeModuleConverter {
    fun fromModelToEntity(instanceDeModule: InstanceDeModule): Optional<EInstanceDeModule> {
        return Optional.empty()
    }

    fun fromEntityToModel(eInstanceDeModule: EInstanceDeModule): Optional<InstanceDeModule> {
        return Optional.empty()
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