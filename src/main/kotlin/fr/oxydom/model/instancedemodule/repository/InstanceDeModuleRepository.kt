package fr.oxydom.model.instancedemodule.repository

import fr.oxydom.model.instancedemodule.InstanceDeModule

interface InstanceDeModuleRepository {
    fun retrieveById (idInstanceDeModuleRepository: Int)
    fun retrieveList()
    fun update(instanceDeModule: InstanceDeModule)
}