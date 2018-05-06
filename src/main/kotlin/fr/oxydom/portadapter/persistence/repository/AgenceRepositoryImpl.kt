package fr.oxydom.portadapter.persistence.repository

import fr.oxydom.model.agence.Agence
import fr.oxydom.model.agence.repository.AgenceRepository
import org.springframework.stereotype.Component
import fr.oxydom.portadapter.persistence.converter.AgenceConverter
import fr.oxydom.portadapter.persistence.mapper.AgenceMapper
import java.util.*

@Component
class AgenceRepositoryImpl (val mapper: AgenceMapper, val converter : AgenceConverter) : AgenceRepository {

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

    fun assertNotNull(agence: Optional<fr.oxydom.portadapter.persistence.entity.EAgence>){
        if(!agence.isPresent){
            throw Exception("no id found for agencie")
        }
    }

    fun assertNotEmpty(agences: List<fr.oxydom.portadapter.persistence.entity.EAgence>){
        if (agences.isEmpty()){
            throw Exception("empty list of agencies")
        }
    }
}