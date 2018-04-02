package domainmodel.model.intervention.repository

import domainmodel.model.intervention.Intervention

interface InterventionRepository {
    fun retrieveById(idIntervention: Int)
    fun retrieveList()
    fun update(intervention: Intervention)
}