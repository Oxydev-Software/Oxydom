package portadapter.persistence.mapper

import dagger.Component
import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import java.util.*
@Component
interface CategorieMapper {
    fun retrieveById(@Param("id") idCategorie : Int) : Optional<ECategorie>
    fun retrieveList() : List<ECategorie>
}