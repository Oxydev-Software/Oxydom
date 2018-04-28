package portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.EFournisseur
import java.util.*

interface FournisseurMapper {
    fun retrieveById(@Param("id") idFournisseur : Int) : Optional<EFournisseur>
    fun retrieveList() : List<EFournisseur>
}