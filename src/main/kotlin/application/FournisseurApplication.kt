package application

import dagger.Component
import domain.model.fournisseur.Fournisseur
@Component
interface FournisseurApplication {
    fun retrieveById(idFournisseur : Int) : Fournisseur
    fun retrieveList() : List<Fournisseur>
}