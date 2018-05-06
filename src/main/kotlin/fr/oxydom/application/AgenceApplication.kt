package fr.oxydom.application

import fr.oxydom.model.agence.Agence

interface AgenceApplication {
    fun retrieveById(idAgence : Int) : Agence
    fun retrieveList() : List<Agence>
}