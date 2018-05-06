package fr.oxydom.portadapter.persistence.entity

data class EFournisseur (
    var idFournisseur: Int,
    var numeroSiret: String,
    var nom: String,
    var adresse: String,
    var ville: String,
    var pays: String,
    var email: String,
    var telephone: String,
    var eAgences : List<EAgence>){
}