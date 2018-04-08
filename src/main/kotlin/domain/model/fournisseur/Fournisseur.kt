package domain.model.fournisseur

import domain.model.agence.Agence

data class Fournisseur(
        var idFournisseur: Int,
        var numeroSiret: String,
        var nom: String,
        var adresse: String,
        var ville: String,
        var pays: String,
        var email: String,
        var telephone: String
) {
}