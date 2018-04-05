package portadapter.persistence.entity

import domainmodel.model.commercial.Commercial
import domainmodel.model.projet.Projet
import java.time.ZonedDateTime

class EIntervention(
        var dateIntervention: ZonedDateTime,
        var eprojet : EProjet,
        var ecommercial : ECommercial
) {
}