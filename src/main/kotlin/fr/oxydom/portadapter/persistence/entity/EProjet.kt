package fr.oxydom.portadapter.persistence.entity

data class EProjet (
        var idProjet : Int,
        var libelleProjet : String,
        var codeProjet : String,
        var statutProjet : String,
        var eclient : EClient,
        var einterventions : List<EIntervention>,
        var ecommercial : ECommercial,
        var emaquettes : List<EMaquette>)
{
}