package fr.oxydom.model.projet.factory

import fr.oxydom.model.projet.Projet

interface ProjetFactory {
    fun create(projet : Projet)
}