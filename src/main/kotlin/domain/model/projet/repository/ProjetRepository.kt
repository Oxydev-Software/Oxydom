package domain.model.projet.repository

import dagger.Component
import domain.model.projet.Projet
@Component
interface ProjetRepository {
    fun retrieveById (idModule: Int)
    fun retrieveList()
    fun update(projet : Projet)
}