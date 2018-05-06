package fr.oxydom.model.commercial

import fr.oxydom.model.agence.Agence
import fr.oxydom.model.projet.Projet

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