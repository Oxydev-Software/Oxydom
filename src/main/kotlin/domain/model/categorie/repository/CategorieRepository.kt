package domain.model.categorie.repository

interface CategorieRepository {
    fun retrieveById (idCategorie: Int)
    fun retrieveList()
}