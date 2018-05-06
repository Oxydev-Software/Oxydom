package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.ECategorie
import java.util.*

interface CategorieMapper {
    fun retrieveById(@Param("id") idCategorie : Int) : Optional<ECategorie>
    fun retrieveList() : List<ECategorie>
}