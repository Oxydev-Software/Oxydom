package domainmodel.model.gamme

class Gamme constructor(
        libelleGamme: String,
        bonusIndividuel : Float,
        bonusSet: Float
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return "Gamme()"
    }


}