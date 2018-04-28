package portadapter.persistence.repository

import domain.model.agence.Agence
import domain.model.agence.repository.AgenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import portadapter.persistence.converter.AgenceConverter
import portadapter.persistence.mapper.AgenceMapper
import java.util.*

@Component
class AgenceRepositoryImpl @Autowired constructor(val mapper: AgenceMapper, val converter : AgenceConverter) : AgenceRepository {


    override fun retrieveById(idAgence : Int) : Optional<Agence>{
        val agenceEntity  = mapper.retrieveById(idAgence)
        assertNotNull(agenceEntity)

        return converter.fromEntityToModel(agenceEntity.get())
    }

    override fun retrieveList(): List<Agence> {
        val agenceEntities = mapper.retrieveList()
        assertNotEmpty(agenceEntities)

        return converter.fromEntitiesToModels(agenceEntities)
    }

    fun assertNotNull(agence: Optional<portadapter.persistence.entity.EAgence>){
        if(!agence.isPresent){
            throw Exception("no id found for agencie")
        }
    }

    fun assertNotEmpty(agences: List<portadapter.persistence.entity.EAgence>){
        if (agences.isEmpty()){
            throw Exception("empty list of agencies")
        }
    }
}