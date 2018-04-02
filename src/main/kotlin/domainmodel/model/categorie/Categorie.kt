package domainmodel.model.categorie

data class Categorie(
        var idCategorie: Int,
        var libelleCategorie: String
){
    override fun toString(): String {
        return "Categorie(idCategorie=$idCategorie, libelleCategorie='$libelleCategorie')"
    }
}