package domain.model.instancedemodule.factory

import domain.model.instancedemodule.InstanceDeModule

interface InstanceDeModuleFactory {
    fun create(instanceDeModule: InstanceDeModule)
}