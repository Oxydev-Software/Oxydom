package domain.model.module.repository

import dagger.Component
import domain.model.module.Module
@Component
interface ModuleRepository {
    fun retrieveById (idModule: Int)
    fun retrieveList()
    fun update(module : Module)
}