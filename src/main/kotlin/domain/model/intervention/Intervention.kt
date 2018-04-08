package domain.model.intervention

import domain.model.commercial.Commercial
import domain.model.projet.Projet
import java.time.ZonedDateTime

data class Intervention(
        var idIntervention: Int,
        var dateIntervention: ZonedDateTime,
        var commercial : Commercial,
        var projet : Projet


){
}