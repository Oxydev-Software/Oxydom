package application

import domainmodel.model.agence.Agence

interface AgenceApplication {
    fun retrieveById(idAgence : Int) : Agence
    fun retrieveList() : List<Agence>
}