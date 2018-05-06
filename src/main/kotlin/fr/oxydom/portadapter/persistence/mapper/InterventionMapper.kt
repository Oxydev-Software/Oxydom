package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.ECategorie
import fr.oxydom.portadapter.persistence.entity.EIntervention
import java.util.*

interface InterventionMapper {
    fun retrieveById(@Param("id") idIntervention : Int) : Optional<EIntervention>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("intervention") eIntervention: EIntervention) : Int
    fun update(@Param("intervention") eIntervention: EIntervention) : Int
}