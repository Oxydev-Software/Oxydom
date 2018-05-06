package fr.oxydom.model.agence.repository

import fr.oxydom.model.agence.Agence
import java.util.*

interface AgenceRepository {
    fun retrieveById (idAgence : Int): Optional<Agence>
    fun retrieveList() : List<Agence>
}