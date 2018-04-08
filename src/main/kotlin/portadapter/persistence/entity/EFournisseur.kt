package portadapter.persistence.entity

import domain.model.agence.Agence

data class EFournisseur (
    var idFournisseur: Int,
    var numeroSiret: String,
    var nom: String,
    var adresse: String,
    var ville: String,
    var pays: String,
    var email: String,
    var telephone: String){
}