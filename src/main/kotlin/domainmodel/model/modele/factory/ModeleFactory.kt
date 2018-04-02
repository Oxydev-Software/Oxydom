package domainmodel.model.modele.factory

import domainmodel.model.modele.Modele

interface ModeleFactory {
    fun create(modele : Modele)
}