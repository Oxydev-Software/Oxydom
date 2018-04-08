package portadapter.persistence.entity

import domain.model.agence.Agence
import domain.model.projet.Projet

data class ECommercial(
        var idCommercial : Int,
        var prenom : String,
        var nom : String,
        var email : String,
        var codeCommercial : String,
        var telephone : String,
        var motDePasse : String,
        var pourcentageCommission : Float,
        var eagence : EAgence,
        var eprojets : List<EProjet>
) {
}