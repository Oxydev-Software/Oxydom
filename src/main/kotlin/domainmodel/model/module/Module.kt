package domainmodel.model.module.repository

import domainmodel.model.categorie.Categorie
import domainmodel.model.gamme.Gamme
import domainmodel.model.instancedemodule.InstanceDeModule
import java.awt.ComponentOrientation

class Module constructor(idModule: Int,
                         libelleModule: String,
                         prix: Float,
                         longueur: Float,
                         largeur: Float,
                         epaisseur: Float,
                         commentaire: String,
                         instancesDeModules : List<InstanceDeModule>,
                         categorie : Categorie,
                         valide : Boolean,
                         gamme : Gamme) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return "Module()"
    }


}