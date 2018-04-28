package domain.model.modele.factory

import domain.model.modele.Modele


interface ModeleFactory {
    fun create(modele : Modele)
}