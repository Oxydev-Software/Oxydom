package domain.model.modele

import domain.model.module.Module

data class Modele(
        var idModele : Int,
        var libelleModele : String,
        var prix : Float,
        var modules : List<Module>
){
}