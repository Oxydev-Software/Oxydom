package domain.model.instancedemodule.repository

import domain.model.instancedemodule.InstanceDeModule

interface InstanceDeModuleRepository {
    fun retrieveById (idInstanceDeModuleRepository: Int)
    fun retrieveList()
    fun update(instanceDeModule: InstanceDeModule)
}