package domain.model.intervention.repository

import domain.model.intervention.Intervention

interface InterventionRepository {
    fun retrieveById(idIntervention: Int)
    fun retrieveList()
    fun update(intervention: Intervention)
}