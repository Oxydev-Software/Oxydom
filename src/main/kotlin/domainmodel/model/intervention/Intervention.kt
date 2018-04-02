package domainmodel.model.intervention

import domainmodel.model.commercial.Commercial
import domainmodel.model.projet.Projet
import java.time.ZonedDateTime

data class Intervention(
        var dateIntervention: ZonedDateTime,
        var projet : Projet,
        var commercial : Commercial
) {
    override fun toString(): String {
        return "Intervention(dateIntervention=$dateIntervention, projet=$projet, commercial=$commercial)"
    }
}