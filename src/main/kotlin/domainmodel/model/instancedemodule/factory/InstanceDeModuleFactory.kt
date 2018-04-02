package domainmodel.model.instancedemodule.factory

import domainmodel.model.instancedemodule.InstanceDeModule

interface InstanceDeModuleFactory {
    fun create(instanceDeModule: InstanceDeModule)
}