package domain.model.categorie.repository

import dagger.Component

@Component
interface CategorieRepository {
    fun retrieveById (idCategorie: Int)
    fun retrieveList()
}