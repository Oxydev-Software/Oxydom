package portadapter.persistence.entity

import domain.model.categorie.Categorie
import domain.model.gamme.Gamme
import domain.model.instancedemodule.InstanceDeModule

data class EModule(
        var idModule: Int,
        var libelleModule: String,
        var prix: Float,
        var longueur: Float,
        var largeur: Float,
        var epaisseur: Float,
        var commentaire: String,
        var einstancesDeModules: List<EInstanceDeModule>,
        var categorie: Categorie,
        var valide: Boolean,
        var egamme: EGamme) {
}