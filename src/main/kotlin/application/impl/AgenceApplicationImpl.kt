package application.impl

import application.AgenceApplication
import dagger.Component
import domain.model.agence.Agence
import domain.model.agence.repository.AgenceRepository
import javax.inject.Inject


class AgenceApplicationImpl : AgenceApplication{
    @Inject
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