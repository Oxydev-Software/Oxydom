package fr.oxydom.model.fournisseur.repository

import fr.oxydom.model.fournisseur.Fournisseur
import java.util.*

interface FournisseurRepository {
    fun retrieveById (idFournisseur: Int) : Optional<Fournisseur>
    fun retrieveList() : List<Fournisseur>
}