package portadapter.persistence.entity

import domainmodel.model.categorie.Categorie
import domainmodel.model.gamme.Gamme
import domainmodel.model.instancedemodule.InstanceDeModule

data class EInstanceDeModule(
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
                        var egamme: EGamme,
                        var coordonneesX: Float,
                        var coordonnesY: Float,
                        var orientation: Float) {
}