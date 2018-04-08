package domain.model.projet.factory

import dagger.Component
import domain.model.projet.Projet
@Component
interface ProjetFactory {
    fun create(projet : Projet)
}