package domain.model.instancedemodule

import domain.model.categorie.Categorie
import domain.model.gamme.Gamme
import domain.model.maquette.Maquette
import domain.model.module.Module

data class InstanceDeModule(
        var idInstanceDeModule: Int,
        override var libelleModule : String,
        override var prix: Float,
        override var longueur: Float,
        override var largeur: Float,
        override var epaisseur: Float,
        override var commentaire: String,
        override var categorie: Categorie,
        override var valide: Boolean,
        override var gamme: Gamme,
        var coordonneesX: Float,
        var coordonneesY: Float,
        var orientation: Float,
        var maquette: Maquette,
        var module : Module
        ) : Module(module.idModule, libelleModule, prix, longueur, largeur, epaisseur, commentaire, categorie, valide, gamme) {
}