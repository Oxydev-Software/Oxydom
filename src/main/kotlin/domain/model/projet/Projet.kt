package domain.model.projet

import domain.model.client.Client
import domain.model.commercial.Commercial
import domain.model.intervention.Intervention
import domain.model.maquette.Maquette

data class Projet(
        var idProjet : Int,
        var libelleProjet : String,
        var codeProjet : String,
        var statutProjet : String,
        var client : Client,
        var interventions : List<Intervention>,
        var commercial : Commercial,
        var maquettes : List<Maquette>
){}