package fr.oxydom.application.impl

import fr.oxydom.application.AgenceApplication
import fr.oxydom.model.agence.Agence
import fr.oxydom.model.agence.repository.AgenceRepository
import org.springframework.beans.factory.annotation.Autowired


class AgenceApplicationImpl : AgenceApplication{
    @Autowired
    lateinit var repository: AgenceRepository

    override fun retrieveList(): List<Agence> {
        val agences = repository.retrieveList()
        return agences
    }

    override fun retrieveById(idAgence : Int): Agence {
        val agence =  repository.retrieveById(idAgence).get()
        return agence
    }
}