package domainmodel.model.maquette

import domainmodel.model.instancedemodule.InstanceDeModule
import domainmodel.model.projet.Projet
import domainmodel.model.tva.Tva
import java.time.ZonedDateTime

class Maquette  constructor(
        idMaquette : Int,
        libelleMaquette : String,
        codeMaquette : String,
        numeroDevis : String,
        dateCreationDevis : ZonedDateTime,
        dateLimiteValidite : ZonedDateTime,
        dureeTravauxEstimee : Int,
        commentaire : String,
        status : String,
        instanceDeModules: List<InstanceDeModule>,
        tva : Tva,
        projet : Projet
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
        return "Maquette()"
    }
}