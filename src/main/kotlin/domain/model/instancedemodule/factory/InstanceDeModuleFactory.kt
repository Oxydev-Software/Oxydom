package domain.model.instancedemodule.factory

import dagger.Component
import domain.model.instancedemodule.InstanceDeModule
@Component
interface InstanceDeModuleFactory {
    fun create(instanceDeModule: InstanceDeModule)
}