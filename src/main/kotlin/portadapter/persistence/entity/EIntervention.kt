package portadapter.persistence.entity

import domain.model.commercial.Commercial
import domain.model.projet.Projet
import java.time.ZonedDateTime

class EIntervention(
        var idIntervention : Int,
        var dateIntervention: ZonedDateTime,
        var ecommercial : ECommercial,
        var eprojet : EProjet
) {
}