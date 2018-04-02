package domainmodel.model.projet.factory

import domainmodel.model.projet.Projet

interface ProjetFactory {
    fun create(projet : Projet)
}