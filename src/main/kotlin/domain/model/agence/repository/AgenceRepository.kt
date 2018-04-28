package domain.model.agence.repository

import domain.model.agence.Agence
import java.util.*

interface AgenceRepository {
    fun retrieveById (idAgence : Int): Optional<Agence>
    fun retrieveList() : List<Agence>
}