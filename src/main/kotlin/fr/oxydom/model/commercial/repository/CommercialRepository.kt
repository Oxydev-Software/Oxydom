package fr.oxydom.model.commercial.repository

interface CommercialRepository {
    fun retrieveById (idCommercial: Int)
    fun retrieveList()
}