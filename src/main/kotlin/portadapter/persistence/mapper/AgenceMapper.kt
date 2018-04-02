package portadapter.persistence.mapper

import domainmodel.model.agence.Agence
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import java.util.*

@Mapper
interface AgenceMapper {
    fun retrieveById(@Param("idAgence")idAgence : Int) : Optional<portadapter.persistence.entity.Agence>
    fun retrieveList() : List<portadapter.persistence.entity.Agence>
    fun create(@Param("agence")agence: Agence) : Int
    fun update(@Param("agence")agence : Agence) : Int
}