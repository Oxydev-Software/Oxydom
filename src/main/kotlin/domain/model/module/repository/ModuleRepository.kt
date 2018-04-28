package domain.model.module.repository

import domain.model.module.Module

interface ModuleRepository {
    fun retrieveById (idModule: Int)
    fun retrieveList()
    fun update(module : Module)
}