package domainmodel.model.module.factory

import domainmodel.model.module.Module

interface ModuleFactory {
    fun create(module : Module)
}