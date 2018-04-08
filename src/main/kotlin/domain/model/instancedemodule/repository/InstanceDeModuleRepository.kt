package domain.model.instancedemodule.repository

import dagger.Component
import domain.model.instancedemodule.InstanceDeModule
@Component
interface InstanceDeModuleRepository {
    fun retrieveById (idInstanceDeModuleRepository: Int)
    fun retrieveList()
    fun update(instanceDeModule: InstanceDeModule)
}