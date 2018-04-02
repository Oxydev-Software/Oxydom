package portadapter.persistence.repository

import domainmodel.model.agence.Agence
import domainmodel.model.agence.repository.AgenceRepository
import portadapter.persistence.converter.AgenceConverter
import portadapter.persistence.mapper.AgenceMapper
import java.util.*

class AgenceRepositoryImpl (val mapper: AgenceMapper) : AgenceRepository {
    val converter = AgenceConverter()

    override fun retrieveById(idAgence : Int) :Agence{
        val agenceEntity  = mapper.retrieveById(idAgence)
        assertNotNull(agenceEntity)

        return converter.fromEntityToDomain(agenceEntity.get())
    }

    override fun retrieveList(): List<Agence> {
        val agenceEntities = mapper.retrieveList()
        assertNotEmpty(agenceEntities)

        return converter.fromEntitiesToDomain(agenceEntities)
    }

    fun assertNotNull(agence: Optional<portadapter.persistence.entity.Agence>){
        if(!agence.isPresent){
            throw Exception("no id found for agencie")
        }
    }

    fun assertNotEmpty(agences: List<portadapter.persistence.entity.Agence>){
        if (agences.size == 0){
            throw Exception("empty list of agencies")
        }
    }
}