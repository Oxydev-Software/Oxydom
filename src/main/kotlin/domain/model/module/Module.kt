package domain.model.module

import domain.model.categorie.Categorie
import domain.model.gamme.Gamme
import domain.model.instancedemodule.InstanceDeModule

open class Module(
        var idModule: Int,
        open var libelleModule: String,
        open var prix: Float,
        open var longueur: Float,
        open var largeur: Float,
        open var epaisseur: Float,
        open var commentaire: String,
        open var categorie: Categorie,
        open var valide: Boolean,
        open var gamme: Gamme)
{
}