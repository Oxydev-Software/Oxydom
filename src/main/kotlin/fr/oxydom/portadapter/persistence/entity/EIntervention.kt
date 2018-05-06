package fr.oxydom.portadapter.persistence.entity

import java.time.ZonedDateTime

class EIntervention(
        var idIntervention : Int,
        var dateIntervention: ZonedDateTime,
        var ecommercial : ECommercial,
        var eprojet : EProjet
) {
}