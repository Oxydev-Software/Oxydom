package domainmodel.model.fournisseur

import domainmodel.model.agence.Agence

class Fournisseur constructor(
        idFournisseur: Int,
        numeroSiret : String,
        nom : String,
        adresse : String,
        ville : String,
        pays : String,
        email : String,
        telephone : String,
        agence : List<Agence>
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return "Fournisseur()"
    }

}