package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.ECategorie
import fr.oxydom.portadapter.persistence.entity.EGamme
import java.util.*

interface GammeMapper {
    fun retrieveById(@Param("id") idGamme : Int) : Optional<EGamme>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("gamme") eGamme: EGamme) : Int
    fun update(@Param("gamme") eGamme: EGamme) : Int
}