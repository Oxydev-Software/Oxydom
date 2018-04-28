package portadapter.persistence.entity

data class EModele(
        var idModele : Int,
        var libelleModele : String,
        var prix : Float,
        var eModules : List<EModule>
){

}