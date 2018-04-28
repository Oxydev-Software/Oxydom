package application.impl

import application.AgenceApplication
import domain.model.agence.Agence
import domain.model.agence.repository.AgenceRepository
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