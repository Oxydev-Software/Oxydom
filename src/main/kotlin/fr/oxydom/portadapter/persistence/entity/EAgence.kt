package fr.oxydom.portadapter.persistence.entity

data class EAgence(
        var idAgence: Int,
        var telephone: String,
        var codeAgence: String,
        var adresse: String,
        var ville: String,
        var pays: String,
        var efournisseurs: List<EFournisseur>) {
}

