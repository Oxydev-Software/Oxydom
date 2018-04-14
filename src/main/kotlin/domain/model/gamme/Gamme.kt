package domain.model.gamme

data class Gamme(
        var idGamme : Int,
        var libelleGamme: String,
        var bonusIndividuel : Float,
        var bonusSet: Float
){
}