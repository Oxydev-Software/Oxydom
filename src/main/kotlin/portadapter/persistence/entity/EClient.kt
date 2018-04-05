package portadapter.persistence.entity

import domainmodel.model.projet.Projet

data class EClient(
        var idClient: Int,
        var prenom : String,
        var nom : String,
        var email : String,
        var adresse : String,
        var ville : String,
        var pays : String,
        var telephone : String,
        var photo : String,
        var civilite : String,
        var eprojets : List<EProjet>
) {
}