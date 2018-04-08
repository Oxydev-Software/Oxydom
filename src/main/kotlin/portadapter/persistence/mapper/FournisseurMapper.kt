package portadapter.persistence.mapper

import dagger.Component
import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.EFournisseur
import java.util.*
@Component
interface FournisseurMapper {
    fun retrieveById(@Param("id") idFournisseur : Int) : Optional<EFournisseur>
    fun retrieveList() : List<EFournisseur>
}