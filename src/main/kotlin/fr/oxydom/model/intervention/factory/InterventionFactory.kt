package fr.oxydom.model.intervention.factory

import fr.oxydom.model.intervention.Intervention

interface InterventionFactory {
    fun create(intervention: Intervention)
}