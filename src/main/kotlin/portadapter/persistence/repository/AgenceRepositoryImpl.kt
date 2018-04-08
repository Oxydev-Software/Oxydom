package portadapter.persistence.repository

import dagger.Component
import domain.model.agence.Agence
import domain.model.agence.repository.AgenceRepository
import portadapter.persistence.converter.AgenceConverter
import portadapter.persistence.mapper.AgenceMapper
import java.util.*
import javax.inject.Inject


class AgenceRepositoryImpl : AgenceRepository {
    @Inject
    lateinit var mapper: AgenceMapper
    val converter = AgenceConverter()

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