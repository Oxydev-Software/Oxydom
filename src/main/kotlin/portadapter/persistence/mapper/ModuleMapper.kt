package portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import portadapter.persistence.entity.EModule
import java.util.*

interface ModuleMapper
{
    fun retrieveById(@Param("id") idModule : Int) : Optional<EModule>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("module") eModule: EModule) : Int
    fun update(@Param("module") eModule: EModule) : Int
}