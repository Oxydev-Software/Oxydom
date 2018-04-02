package domainmodel.model.intervention

import domainmodel.model.commercial.Commercial
import domainmodel.model.projet.Projet
import java.time.ZonedDateTime

class Intervention constructor(
        dateIntervention: ZonedDateTime,
        projet : Projet,
        commercial : Commercial
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return "Intervention()"
    }


}