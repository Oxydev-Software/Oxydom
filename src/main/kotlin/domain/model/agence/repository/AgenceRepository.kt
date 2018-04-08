package domain.model.agence.repository

import dagger.Component
import domain.model.agence.Agence
import java.util.*
@Component
interface AgenceRepository {
    fun retrieveById (idAgence : Int): Optional<Agence>
    fun retrieveList() : List<Agence>
}