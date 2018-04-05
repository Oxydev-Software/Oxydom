package portadapter.persistence.entity

import domainmodel.model.module.Module

data class EModele(
        var idModele : Int,
        var libelleModele : String,
        var prix : Float,
        var modules : List<Module>
){

}