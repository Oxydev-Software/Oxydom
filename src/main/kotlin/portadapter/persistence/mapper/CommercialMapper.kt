package portadapter.persistence.mapper

import dagger.Component
import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECommercial
import java.util.*
@Component
interface CommercialMapper {
    fun retrieveById(@Param("id") idCommercial : Int) : Optional<ECommercial>
    fun retrieveList() : List<ECommercial>
}