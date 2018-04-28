package domain.model.fournisseur.repository

import domain.model.fournisseur.Fournisseur
import java.util.*

interface FournisseurRepository {
    fun retrieveById (idFournisseur: Int) : Optional<Fournisseur>
    fun retrieveList() : List<Fournisseur>
}