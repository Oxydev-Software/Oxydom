package portadapter.persistence.entity

import domain.model.client.Client
import domain.model.commercial.Commercial
import domain.model.intervention.Intervention
import domain.model.maquette.Maquette

data class EProjet (
        var idProjet : Int,
        var libelleProjet : String,
        var codeProjet : String,
        var statutProjet : String,
        var eclient : EClient,
        var einterventions : List<EIntervention>,
        var ecommercial : ECommercial,
        var emaquettes : List<EMaquette>)
{
}