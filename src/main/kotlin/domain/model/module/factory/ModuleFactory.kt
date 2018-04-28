package domain.model.module.factory

import domain.model.module.Module

interface ModuleFactory {
    fun create(module : Module)
}