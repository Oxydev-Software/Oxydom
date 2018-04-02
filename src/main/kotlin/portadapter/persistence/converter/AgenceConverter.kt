package portadapter.persistence.converter

import domainmodel.model.agence.Agence

class AgenceConverter {

    fun fromDomainToEntity(agence : Agence) : portadapter.persistence.entity.Agence{

        val agenceEntity = portadapter.persistence.entity.Agence(
                agence.idAgence,
                agence.telephone,
                agence.codeAgence,
                agence.adresse,
                agence.ville,
                agence.pays,
                agence.fournisseurs)

        return agenceEntity
    }

    fun fromEntityToDomain(agence : portadapter.persistence.entity.Agence) : Agence{

        val agence = Agence(agence.idAgence,
                agence.telephone,
                agence.codeAgence,
                agence.adresse,
                agence.ville,
                agence.pays,
                agence.fournisseurs)

        return agence
    }

    fun fromEntitiesToDomain(agenceEntities : List<portadapter.persistence.entity.Agence>) : List<Agence>{
        val agences = ArrayList<Agence>()

        for(agence in agenceEntities){
            val agence = Agence(agence.idAgence,
                    agence.telephone,
                    agence.codeAgence,
                    agence.adresse,
                    agence.ville,
                    agence.pays,
                    agence.fournisseurs)
            agences.add(agence)
        }

        return agences
    }
}