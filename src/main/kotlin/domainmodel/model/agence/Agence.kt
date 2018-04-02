package domainmodel.model.agence

import domainmodel.model.fournisseur.Fournisseur

class Agence constructor(
        idAgence: Int,
        telephone : String,
        codeAgence : String,
        adresse : String,
        ville : String,
        pays : String,
        fournisseurs : List<Fournisseur>
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
        return "Agence()"
    }


}