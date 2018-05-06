package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.ECategorie
import fr.oxydom.portadapter.persistence.entity.EModele
import java.util.*

interface ModeleMapper {
    fun retrieveById(@Param("id") idModele : Int) : Optional<EModele>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("modele") eModele: EModele) : Int
    fun update(@Param("modele") eModele: EModele) : Int
}