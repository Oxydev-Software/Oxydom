package domainmodel.model.module

import domainmodel.model.categorie.Categorie
import domainmodel.model.gamme.Gamme
import domainmodel.model.instancedemodule.InstanceDeModule

data class Module(
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
}