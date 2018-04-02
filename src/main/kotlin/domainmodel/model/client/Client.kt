package domainmodel.model.client

import domainmodel.model.projet.Projet

class Client constructor(
        idClient: Int,
        prenom : String,
        nom : String,
        email : String,
        adresse : String,
        ville : String,
        pays : String,
        telephone : String,
        photo : String,
        civilite : String,
        projets : List<Projet>
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
        return "Client()"
    }


}