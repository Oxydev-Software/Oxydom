package application.impl

import application.FournisseurApplication
import domain.model.fournisseur.Fournisseur
import domain.model.fournisseur.repository.FournisseurRepository
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