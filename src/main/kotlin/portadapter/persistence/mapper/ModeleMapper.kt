package portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import portadapter.persistence.entity.EGamme
import portadapter.persistence.entity.EModele
import java.util.*

interface ModeleMapper {
    fun retrieveById(@Param("id") idModele : Int) : Optional<EModele>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("modele") eModele: EModele) : Int
    fun update(@Param("modele") eModele: EModele) : Int
}