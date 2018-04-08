package domain.model.intervention.factory

import dagger.Component
import domain.model.intervention.Intervention
@Component
interface InterventionFactory {
    fun create(intervention: Intervention)
}