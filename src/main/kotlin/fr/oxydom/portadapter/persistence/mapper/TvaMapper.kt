package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.ECategorie
import fr.oxydom.portadapter.persistence.entity.ETva
import java.util.*

interface TvaMapper {
    fun retrieveById(@Param("id") idTva : Int) : Optional<ETva>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("tva") eTva: ETva) : Int
    fun update(@Param("tva") eTva: ETva) : Int
}