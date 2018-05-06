package fr.oxydom.model.intervention

import fr.oxydom.model.commercial.Commercial
import fr.oxydom.model.projet.Projet
import java.time.ZonedDateTime

data class Intervention(
        var idIntervention: Int,
        var dateIntervention: ZonedDateTime,
        var commercial : Commercial,
        var projet : Projet


){
}