package domain.model.instancedemodule

import domain.model.categorie.Categorie
import domain.model.gamme.Gamme

data class InstanceDeModule(
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
}