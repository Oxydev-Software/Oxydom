package fr.oxydom.portadapter.persistence.mapper

import fr.oxydom.portadapter.persistence.entity.EClient
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import java.util.*

@Mapper
interface ClientMapper {
     @Select("SELECT * FROM t_client_clt WHERE id = #{id}")
     fun retrieveById(@Param("id") idClient : Int) : Optional<EClient>
     fun retrieveList() : List<EClient>
     fun create(@Param("client")eclient : EClient) : Int
     fun update(@Param("client")eclient: EClient) : Int
}