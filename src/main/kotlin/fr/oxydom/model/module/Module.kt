package fr.oxydom.model.module

import fr.oxydom.model.categorie.Categorie
import fr.oxydom.model.gamme.Gamme
import fr.oxydom.model.instancedemodule.InstanceDeModule

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