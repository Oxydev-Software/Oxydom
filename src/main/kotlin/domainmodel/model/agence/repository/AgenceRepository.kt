package domainmodel.model.agence.repository

import domainmodel.model.agence.Agence
import java.util.*

interface AgenceRepository {
    fun retrieveById (idAgence : Int): Optional<Agence>
    fun retrieveList() : List<Agence>
}