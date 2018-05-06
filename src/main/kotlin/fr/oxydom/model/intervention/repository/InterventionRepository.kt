package fr.oxydom.model.intervention.repository

import fr.oxydom.model.intervention.Intervention

interface InterventionRepository {
    fun retrieveById(idIntervention: Int)
    fun retrieveList()
    fun update(intervention: Intervention)
}