package domainmodel.model.instancedemodule

import domainmodel.model.categorie.Categorie
import domainmodel.model.gamme.Gamme

data class InstanceDeModule(
        var idModule: Int,
        var libelleModule: String,
        var prix: Float,
        var longueur: Float,
        var largeur: Float,
        var epaisseur: Float,
        var commentaire: String,
        var instancesDeModules: List<InstanceDeModule>,
        var categorie: Categorie,
        var valide: Boolean,
        var gamme: Gamme,
        var coordonneesX: Float,
        var coordonnesY: Float,
        var orientation: Float) {
    override fun toString(): String {
        return "InstanceDeModule(idModule=$idModule, libelleModule='$libelleModule', prix=$prix, longueur=$longueur, largeur=$largeur, epaisseur=$epaisseur, commentaire='$commentaire', instancesDeModules=$instancesDeModules, categorie=$categorie, valide=$valide, gamme=$gamme, coordonneesX=$coordonneesX, coordonnesY=$coordonnesY, orientation=$orientation)"
    }
}