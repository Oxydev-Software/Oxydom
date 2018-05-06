package fr.oxydom.model.module.factory

import fr.oxydom.model.module.Module

interface ModuleFactory {
    fun create(module : Module)
}