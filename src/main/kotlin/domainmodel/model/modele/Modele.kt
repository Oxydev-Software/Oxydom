package domainmodel.model.modele

import domainmodel.model.module.Module

data class Modele(
        var idModele : Int,
        var libelleModele : String,
        var prix : Float,
        var modules : List<Module>
){
    override fun toString(): String {
        return "Modele(idModele=$idModele, libelleModele='$libelleModele', prix=$prix, modules=$modules)"
    }
}