package fr.oxydom.portadapter.persistence.entity

data class EClient(
        val id: Int? = null,
        var prenom: String? = null,
        var nom: String? = null,
        var email: String? =null,
        var adresse: String?=null,
        var ville: String?=null,
        var pays: String?=null,
        var telephone: String?=null,
        var photo: String?=null,
        var civilite: String?=null
)