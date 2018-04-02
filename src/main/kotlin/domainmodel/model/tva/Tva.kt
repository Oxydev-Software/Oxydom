package domainmodel.model.tva

class Tva constructor(
        idTva: Int,
        taux : Float
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
        return "Tva()"
    }


}