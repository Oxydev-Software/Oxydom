package fr.oxydom.application

import fr.oxydom.model.fournisseur.Fournisseur

interface FournisseurApplication {
    fun retrieveById(idFournisseur : Int) : Fournisseur
    fun retrieveList() : List<Fournisseur>
}