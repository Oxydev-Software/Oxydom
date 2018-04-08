package domain.model.maquette

import domain.model.instancedemodule.InstanceDeModule
import domain.model.projet.Projet
import domain.model.tva.Tva
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
}