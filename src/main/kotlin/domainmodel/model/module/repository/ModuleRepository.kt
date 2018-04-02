package domainmodel.model.module.repository

import domainmodel.model.module.Module

interface ModuleRepository {
    fun retrieveById (idModule: Int)
    fun retrieveList()
    fun update(module : Module)
}