package fr.oxydom.model.modele

import fr.oxydom.model.module.Module

data class Modele(
        var idModele : Int,
        var libelleModele : String,
        var prix : Float,
        var modules : List<Module>
){
}