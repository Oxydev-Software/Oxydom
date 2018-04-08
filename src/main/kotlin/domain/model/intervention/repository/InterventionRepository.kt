package domain.model.intervention.repository

import dagger.Component
import domain.model.intervention.Intervention
@Component
interface InterventionRepository {
    fun retrieveById(idIntervention: Int)
    fun retrieveList()
    fun update(intervention: Intervention)
}