package domain.model.module.factory

import dagger.Component
import domain.model.module.Module
@Component
interface ModuleFactory {
    fun create(module : Module)
}