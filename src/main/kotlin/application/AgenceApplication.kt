package application

import dagger.Component
import domain.model.agence.Agence

@Component
interface AgenceApplication {
    fun retrieveById(idAgence : Int) : Agence
    fun retrieveList() : List<Agence>
}