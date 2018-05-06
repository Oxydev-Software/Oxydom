package fr.oxydom.model.instancedemodule

import fr.oxydom.model.categorie.Categorie
import fr.oxydom.model.gamme.Gamme
import fr.oxydom.model.maquette.Maquette
import fr.oxydom.model.module.Module

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