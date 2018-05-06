package fr.oxydom.application.impl

import fr.oxydom.application.FournisseurApplication
import fr.oxydom.model.fournisseur.Fournisseur
import fr.oxydom.model.fournisseur.repository.FournisseurRepository
import org.springframework.beans.factory.annotation.Autowired

class FournisseurApplicationImpl :  FournisseurApplication{
    @Autowired
    lateinit var repository: FournisseurRepository

    override fun retrieveList(): List<Fournisseur> {
        val fournisseur = repository.retrieveList()
        return fournisseur
    }

    override fun retrieveById(idFournisseur : Int): Fournisseur {
        val fournisseur =  repository.retrieveById(idFournisseur).get()
        return fournisseur
    }

}