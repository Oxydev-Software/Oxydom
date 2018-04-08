package portadapter.persistence.mapper

import dagger.Component
import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.EAgence
import java.util.*

@Component
interface AgenceMapper {
    fun retrieveById(@Param("idAgence")idAgence : Int) : Optional<EAgence>
    fun retrieveList() : List<EAgence>
    fun create(@Param("agence")eagence: EAgence) : Int
    fun update(@Param("agence")eagence : EAgence) : Int
}