package domainmodel.model.commercial

import domainmodel.model.agence.Agence
import domainmodel.model.projet.Projet

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
    override fun toString(): String {
        return "Commercial(idCommercial=$idCommercial, prenom='$prenom', nom='$nom', email='$email', codeCommercial='$codeCommercial', telephone='$telephone', motDePasse='$motDePasse', pourcentageCommission=$pourcentageCommission, agence=$agence, projets=$projets)"
    }
}