package domainmodel.model.gamme

data class Gamme(
        var libelleGamme: String,
        var bonusIndividuel : Float,
        var bonusSet: Float
){
    override fun toString(): String {
        return "Gamme(libelleGamme='$libelleGamme', bonusIndividuel=$bonusIndividuel, bonusSet=$bonusSet)"
    }
}