package domainmodel.model.instancedemodule

import domainmodel.model.categorie.Categorie
import domainmodel.model.gamme.Gamme

class InstanceDeModule constructor(idModule: Int,
                                   libelleModule: String,
                                   prix: Float,
                                   longueur: Float,
                                   largeur: Float,
                                   epaisseur: Float,
                                   commentaire: String,
                                   instancesDeModules : List<InstanceDeModule>,
                                   categorie : Categorie,
                                   valide : Boolean,
                                   gamme : Gamme,
                                   coordonneesX : Float,
                                   coordonnesY : Float,
                                   orientation: Float){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return "InstanceDeModule()"
    }


}