package fr.oxydom.model.modele.factory

import fr.oxydom.model.modele.Modele


interface ModeleFactory {
    fun create(modele : Modele)
}