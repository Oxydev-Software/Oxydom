package portadapter.persistence.entity

import domainmodel.model.client.Client
import domainmodel.model.commercial.Commercial
import domainmodel.model.intervention.Intervention
import domainmodel.model.maquette.Maquette

data class EProjet (
        var idProjet : String,
        var libelleProjet : String,
        var codeProjet : String,
        var statutProjet : String,
        var eclient : EClient,
        var einterventions : List<EIntervention>,
        var ecommercial : ECommercial,
        var emaquettes : List<EMaquette>)
{
}