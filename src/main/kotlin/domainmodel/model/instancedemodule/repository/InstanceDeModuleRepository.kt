package domainmodel.model.instancedemodule.repository

import domainmodel.model.instancedemodule.InstanceDeModule

interface InstanceDeModuleRepository {
    fun retrieveById (idInstanceDeModuleRepository: Int)
    fun retrieveList()
    fun update(instanceDeModule: InstanceDeModule)
}