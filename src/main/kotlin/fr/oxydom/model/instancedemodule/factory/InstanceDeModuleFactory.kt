package fr.oxydom.model.instancedemodule.factory

import fr.oxydom.model.instancedemodule.InstanceDeModule

interface InstanceDeModuleFactory {
    fun create(instanceDeModule: InstanceDeModule)
}