package domainmodel.model.projet

import domainmodel.model.client.Client
import domainmodel.model.commercial.Commercial
import domainmodel.model.intervention.Intervention
import domainmodel.model.maquette.Maquette

class Projet constructor(
        idProjet : String,
        libelleProjet : String,
        codeProjet : String,
        statutProjet : String,
        client : Client,
        interventions : List<Intervention>,
        commercial : Commercial,
        maquettes : List<Maquette>
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
        return "Projet()"
    }

}