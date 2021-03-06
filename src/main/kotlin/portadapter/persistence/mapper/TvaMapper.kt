package portadapter.persistence.mapper

import dagger.Component
import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import portadapter.persistence.entity.ETva
import java.util.*
@Component
interface TvaMapper {
    fun retrieveById(@Param("id") idTva : Int) : Optional<ETva>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("tva") eTva: ETva) : Int
    fun update(@Param("tva") eTva: ETva) : Int
}