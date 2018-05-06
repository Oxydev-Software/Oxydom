package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.ECommercial
import java.util.*

interface CommercialMapper {
    fun retrieveById(@Param("id") idCommercial : Int) : Optional<ECommercial>
    fun retrieveList() : List<ECommercial>
}