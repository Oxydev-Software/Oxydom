package domainmodel.model.commercial

import domainmodel.model.agence.Agence
import domainmodel.model.projet.Projet

class Commercial constructor(
        idCommercial : Int,
        prenom : String,
        nom : String,
        email : String,
        codeCommercial : String,
        telephone : String,
        motDePasse : String,
        pourcentageCommission : Float,
        agence : Agence,
        projets : List<Projet>
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
        return "Commercial()"
    }


}