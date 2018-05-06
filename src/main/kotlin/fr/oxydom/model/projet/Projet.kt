package fr.oxydom.model.projet

import fr.oxydom.model.client.Client
import fr.oxydom.model.commercial.Commercial
import fr.oxydom.model.intervention.Intervention
import fr.oxydom.model.maquette.Maquette

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