package domainmodel.model.module

import domainmodel.model.categorie.Categorie
import domainmodel.model.gamme.Gamme
import domainmodel.model.instancedemodule.InstanceDeModule

data class Module(
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
        var gamme: Gamme)
{
    override fun toString(): String {
        return "Module(idModule=$idModule, libelleModule='$libelleModule', prix=$prix, longueur=$longueur, largeur=$largeur, epaisseur=$epaisseur, commentaire='$commentaire', instancesDeModules=$instancesDeModules, categorie=$categorie, valide=$valide, gamme=$gamme)"
    }
}