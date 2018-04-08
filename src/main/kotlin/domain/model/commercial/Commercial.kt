package domain.model.commercial

import domain.model.agence.Agence
import domain.model.projet.Projet

data class Commercial(
        var idCommercial : Int,
        var prenom : String,
        var nom : String,
        var email : String,
        var codeCommercial : String,
        var telephone : String,
        var motDePasse : String,
        var pourcentageCommission : Float,
        var agence : Agence,
        var projets : List<Projet>
) {
}