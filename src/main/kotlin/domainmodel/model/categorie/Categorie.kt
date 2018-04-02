package domainmodel.model.categorie

class Categorie constructor(
        idCategorie: Int,
        libelleCategorie: String
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return "Categorie()"
    }


}