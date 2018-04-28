package portadapter.persistence.entity

data class EClient(
        val id: Int?,
        var prenom: String,
        var nom: String,
        var email: String,
        var adresse: String,
        var ville: String,
        var pays: String,
        var telephone: String,
        var photo: String,
        var civilite: String,
        var eprojets: List<EProjet>
)