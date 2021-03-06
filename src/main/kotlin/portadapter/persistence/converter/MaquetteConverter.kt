package portadapter.persistence.converter

import domain.model.instancedemodule.InstanceDeModule
import domain.model.intervention.Intervention
import domain.model.maquette.Maquette
import portadapter.persistence.entity.EIntervention
import portadapter.persistence.entity.EMaquette
import java.util.*
import java.util.stream.Collectors
import javax.inject.Inject

class MaquetteConverter {
    @Inject
    lateinit var tvaConverter: TvaConverter
    @Inject
    lateinit var projetConverter: ProjetConverter
    @Inject
    lateinit var instanceDeModuleConverter: InstanceDeModuleConverter

    fun fromModelToEntity(maquette: Maquette): Optional<EMaquette> {

        val maquetteEntities = EMaquette(
                maquette.idMaquette,
                maquette.libelleMaquette,
                maquette.codeMaquette,
                maquette.numeroDevis,
                maquette.dateCreationDevis,
                maquette.dateLimiteValidite,
                maquette.dureeTravauxEstimee,
                maquette.commentaire,
                maquette.status,
                instanceDeModuleConverter.fromModelsToEntities(maquette.instanceDeModules),
                tvaConverter.fromModelToEntity(maquette.tva).orElse(null),
                projetConverter.fromModelToEntity(maquette.projet).orElse(null))

        return Optional.of(maquetteEntities)
    }

    fun fromEntityToModel(eMaquette: EMaquette): Optional<Maquette> {
        if (null == eMaquette) {
            return Optional.empty();
        }
        val maquette = Maquette(
                eMaquette.idMaquette,
                eMaquette.libelleMaquette,
                eMaquette.codeMaquette,
                eMaquette.numeroDevis,
                eMaquette.dateCreationDevis,
                eMaquette.dateLimiteValidite,
                eMaquette.dureeTravauxEstimee,
                eMaquette.commentaire,
                eMaquette.status,
                instanceDeModuleConverter.fromEntitiesToModels(eMaquette.einstanceDeModules),
                tvaConverter.fromEntityToModel(eMaquette.etva).orElse(null),
                projetConverter.fromEntityToModel(eMaquette.eprojet).orElse(null))

        return Optional.of(maquette);
    }

    fun fromEntitiesToModels(maquetteEntities: List<EMaquette>): List<Maquette> {
        if (maquetteEntities.isEmpty()) {
            return emptyList()
        }

        val maquettes = maquetteEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Maquette>::isPresent)
                .map(Optional<Maquette>::get)
                .collect(Collectors.toList())
        return maquettes
    }

    fun fromModelsToEntities(maquettes: List<Maquette>): List<EMaquette> {
        if (maquettes.isEmpty()) {
            return emptyList()
        }

        val maquetteEntities = maquettes.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<EMaquette>::isPresent)
                .map(Optional<EMaquette>::get)
                .collect(Collectors.toList())

        return maquetteEntities;
    }
}