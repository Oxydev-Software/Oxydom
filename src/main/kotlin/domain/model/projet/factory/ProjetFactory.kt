package domain.model.projet.factory

import domain.model.projet.Projet

interface ProjetFactory {
    fun create(projet : Projet)
}