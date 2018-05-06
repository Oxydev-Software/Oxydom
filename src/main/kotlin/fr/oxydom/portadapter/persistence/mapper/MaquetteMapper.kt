package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.ECategorie
import fr.oxydom.portadapter.persistence.entity.EMaquette
import java.util.*

interface MaquetteMapper{
    fun retrieveById(@Param("id") idMaquette : Int) : Optional<EMaquette>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("maquette") eMaquette: EMaquette) : Int
    fun update(@Param("maquette") eMaquette: EMaquette) : Int
}