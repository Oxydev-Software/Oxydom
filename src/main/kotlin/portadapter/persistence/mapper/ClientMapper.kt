package portadapter.persistence.mapper

import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.EClient
import java.util.*

interface ClientMapper {
    fun retrieveById(@Param("id") idClient : Int) : Optional<EClient>
    fun retrieveList() : List<EClient>
    fun create(@Param("client")eclient : EClient) : Int
    fun update(@Param("client")eclient: EClient) : Int
}