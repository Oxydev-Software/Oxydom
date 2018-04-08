package domain.model.fournisseur.repository

import dagger.Component
import domain.model.fournisseur.Fournisseur
import java.util.*
@Component
interface FournisseurRepository {
    fun retrieveById (idFournisseur: Int) : Optional<Fournisseur>
    fun retrieveList() : List<Fournisseur>
}