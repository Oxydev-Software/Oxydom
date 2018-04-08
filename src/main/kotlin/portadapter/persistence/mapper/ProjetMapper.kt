package portadapter.persistence.mapper

import dagger.Component
import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import portadapter.persistence.entity.EProjet
import java.util.*
@Component
interface ProjetMapper {
    fun retrieveById(@Param("id") idProjet : Int) : Optional<EProjet>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("projet") eProjet: EProjet) : Int
    fun update(@Param("projet") eProjet: EProjet) : Int
}