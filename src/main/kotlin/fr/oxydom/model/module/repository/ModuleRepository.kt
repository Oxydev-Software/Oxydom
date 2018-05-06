package fr.oxydom.model.module.repository

import fr.oxydom.model.module.Module

interface ModuleRepository {
    fun retrieveById (idModule: Int)
    fun retrieveList()
    fun update(module : Module)
}