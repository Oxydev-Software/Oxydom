package portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import portadapter.persistence.entity.EGamme
import portadapter.persistence.entity.EIntervention
import java.util.*

interface InterventionMapper {
    fun retrieveById(@Param("id") idIntervention : Int) : Optional<EIntervention>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("intervention") eIntervention: EIntervention) : Int
    fun update(@Param("intervention") eIntervention: EIntervention) : Int
}