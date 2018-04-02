package domainmodel.model.projet

import domainmodel.model.client.Client
import domainmodel.model.commercial.Commercial
import domainmodel.model.intervention.Intervention
import domainmodel.model.maquette.Maquette

data class Projet(
        var idProjet : String,
        var libelleProjet : String,
        var codeProjet : String,
        var statutProjet : String,
        var client : Client,
        var interventions : List<Intervention>,
        var commercial : Commercial,
        var maquettes : List<Maquette>
){
    override fun toString(): String {
        return "Projet(idProjet='$idProjet', libelleProjet='$libelleProjet', codeProjet='$codeProjet', statutProjet='$statutProjet', client=$client, interventions=$interventions, commercial=$commercial, maquettes=$maquettes)"
    }
}