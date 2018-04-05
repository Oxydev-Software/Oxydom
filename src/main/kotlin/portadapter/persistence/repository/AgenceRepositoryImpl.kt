package portadapter.persistence.repository

import domainmodel.model.agence.Agence
import domainmodel.model.agence.repository.AgenceRepository
import portadapter.persistence.converter.AgenceConverter
import portadapter.persistence.mapper.AgenceMapper
import java.util.*

class AgenceRepositoryImpl : AgenceRepository {
    lateinit var mapper: AgenceMapper
    val converter = AgenceConverter()

    override fun retrieveById(idAgence : Int) : Optional<Agence>{
        val agenceEntity  = mapper.retrieveById(idAgence)
        assertNotNull(agenceEntity)

        return converter.fromEntityToModel(agenceEntity.orElse(null))
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
        if (agences.size == 0){
            throw Exception("empty list of agencies")
        }
    }
}