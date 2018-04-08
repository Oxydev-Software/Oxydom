package portadapter.persistence.mapper

import dagger.Component
import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import portadapter.persistence.entity.EMaquette
import java.util.*
@Component
interface MaquetteMapper{
    fun retrieveById(@Param("id") idMaquette : Int) : Optional<EMaquette>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("maquette") eMaquette: EMaquette) : Int
    fun update(@Param("maquette") eMaquette: EMaquette) : Int
}