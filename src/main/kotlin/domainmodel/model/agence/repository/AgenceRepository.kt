package domainmodel.model.agence.repository

import domainmodel.model.agence.Agence

interface AgenceRepository {
    fun retrieveById (idAgence : Int): Agence
    fun retrieveList() : List<Agence>
}