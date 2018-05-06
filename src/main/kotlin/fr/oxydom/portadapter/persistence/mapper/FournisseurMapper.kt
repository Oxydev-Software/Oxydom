package fr.oxydom.portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import fr.oxydom.portadapter.persistence.entity.EFournisseur
import java.util.*

interface FournisseurMapper {
    fun retrieveById(@Param("id") idFournisseur : Int) : Optional<EFournisseur>
    fun retrieveList() : List<EFournisseur>
}