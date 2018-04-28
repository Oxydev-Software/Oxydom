package portadapter.persistence.repository

import domain.model.fournisseur.Fournisseur
import domain.model.fournisseur.repository.FournisseurRepository
import java.util.*


class FournisseurRepositoryImpl : FournisseurRepository {
    override fun retrieveById(idFournisseur: Int): Optional<Fournisseur> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun retrieveList(): List<Fournisseur> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}