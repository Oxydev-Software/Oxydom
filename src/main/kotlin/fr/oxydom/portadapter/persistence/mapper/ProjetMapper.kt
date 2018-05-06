package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.ECategorie
import fr.oxydom.portadapter.persistence.entity.EProjet
import java.util.*

interface ProjetMapper {
    fun retrieveById(@Param("id") idProjet : Int) : Optional<EProjet>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("projet") eProjet: EProjet) : Int
    fun update(@Param("projet") eProjet: EProjet) : Int
}