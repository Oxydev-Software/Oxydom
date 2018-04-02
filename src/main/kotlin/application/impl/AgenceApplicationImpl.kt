package application.impl

import application.AgenceApplication
import domainmodel.model.agence.Agence
import domainmodel.model.agence.repository.AgenceRepository

class AgenceApplicationImpl(val repository : AgenceRepository) : AgenceApplication{
    override fun retrieveList(): List<Agence> {
        val agences = repository.retrieveList()
        return agences
    }

    override fun retrieveById(idAgence : Int): Agence {
        val agence =  repository.retrieveById(idAgence)
        return agence
    }
}