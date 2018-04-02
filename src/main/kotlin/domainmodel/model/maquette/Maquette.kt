package domainmodel.model.maquette

import domainmodel.model.instancedemodule.InstanceDeModule
import domainmodel.model.projet.Projet
import domainmodel.model.tva.Tva
import java.time.ZonedDateTime

data class Maquette (
        var idMaquette : Int,
        var libelleMaquette : String,
        var codeMaquette : String,
        var numeroDevis : String,
        var dateCreationDevis : ZonedDateTime,
        var dateLimiteValidite : ZonedDateTime,
        var dureeTravauxEstimee : Int,
        var commentaire : String,
        var status : String,
        var instanceDeModules: List<InstanceDeModule>,
        var tva : Tva,
        var projet : Projet
){
    override fun toString(): String {
        return "Maquette(idMaquette=$idMaquette, libelleMaquette='$libelleMaquette', codeMaquette='$codeMaquette', numeroDevis='$numeroDevis', dateCreationDevis=$dateCreationDevis, dateLimiteValidite=$dateLimiteValidite, dureeTravauxEstimee=$dureeTravauxEstimee, commentaire='$commentaire', status='$status', instanceDeModules=$instanceDeModules, tva=$tva, projet=$projet)"
    }
}