package application

import domain.model.fournisseur.Fournisseur

interface FournisseurApplication {
    fun retrieveById(idFournisseur : Int) : Fournisseur
    fun retrieveList() : List<Fournisseur>
}