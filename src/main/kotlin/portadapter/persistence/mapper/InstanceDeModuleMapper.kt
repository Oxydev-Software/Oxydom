package portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import portadapter.persistence.entity.EInstanceDeModule
import java.util.*

interface InstanceDeModuleMapper {
    fun retrieveById(@Param("id") idInstanceDeModule : Int) : Optional<EInstanceDeModule>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("instanceDeModule") eInstanceDeModule: EInstanceDeModule) : Int
    fun update(@Param("instanceDeModule") eInstanceDeModule: EInstanceDeModule) : Int
}