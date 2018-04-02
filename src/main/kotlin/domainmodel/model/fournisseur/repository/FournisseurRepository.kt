package domainmodel.model.fournisseur.repository

interface FournisseurRepository {
    fun retrieveById (idFournisseur: Int)
    fun retrieveList()
}