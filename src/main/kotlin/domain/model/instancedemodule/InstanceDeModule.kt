package domain.model.instancedemodule

import domain.model.categorie.Categorie
import domain.model.gamme.Gamme

data class InstanceDeModule(
        var idInstanceDeModule: Int,
        var libelleModule: String,
        var prix: Float,
        var longueur: Float,
        var largeur: Float,
        var epaisseur: Float,
        var commentaire: String,
        var categorie: Categorie,
        var valide: Boolean,
        var gamme: Gamme,
        var coordonneesX: Float,
        var coordonneesY: Float,
        var orientation: Float) {
}