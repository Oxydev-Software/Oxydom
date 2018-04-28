package domain.model.intervention.factory

import domain.model.intervention.Intervention

interface InterventionFactory {
    fun create(intervention: Intervention)
}