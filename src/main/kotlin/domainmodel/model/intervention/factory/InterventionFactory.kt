package domainmodel.model.intervention.factory

import domainmodel.model.intervention.Intervention

interface InterventionFactory {
    fun create(intervention: Intervention)
}