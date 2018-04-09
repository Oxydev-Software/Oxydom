package portadapter.persistence.entity

import domain.model.categorie.Categorie
import domain.model.gamme.Gamme
import domain.model.instancedemodule.InstanceDeModule

data class EInstanceDeModule(
        var idInstanceDeModule: Int,
        var libelleModule: String,
        var prix: Float,
        var longueur: Float,
        var largeur: Float,
        var epaisseur: Float,
        var commentaire: String,
        var ecategorie: ECategorie,
        var valide: Boolean,
        var egamme: EGamme,
        var coordonneesX: Float,
        var coordonneesY: Float,
        var orientation: Float) {
}