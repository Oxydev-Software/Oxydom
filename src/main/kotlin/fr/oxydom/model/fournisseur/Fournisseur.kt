package fr.oxydom.model.fournisseur

import fr.oxydom.model.agence.Agence

data class Fournisseur(
        var idFournisseur: Int,
        var numeroSiret: String,
        var nom: String,
        var adresse: String,
        var ville: String,
        var pays: String,
        var email: String,
        var telephone: String,
        var agences : List<Agence>
) {
}