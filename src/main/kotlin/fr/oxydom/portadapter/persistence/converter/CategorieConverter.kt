package fr.oxydom.portadapter.persistence.converter

import fr.oxydom.model.categorie.Categorie
import fr.oxydom.portadapter.persistence.entity.ECategorie
import java.util.*
import java.util.stream.Collectors

class CategorieConverter {
    fun fromModelToEntity(categorie: Categorie): Optional<ECategorie> {
        if (null == categorie){
            return Optional.empty()
        }
        val entity  = ECategorie(
                categorie.idCategorie,
                categorie.libelleCategorie
        )
        return Optional.of(entity)
    }

    fun fromEntityToModel(eCategorie: ECategorie): Optional<Categorie> {
        if(null == eCategorie){
            return Optional.empty()
        }
        val model = Categorie(
                eCategorie.idCategorie,
                eCategorie.libelleCategorie
        )
        return Optional.of(model)
    }

    fun fromEntitiesToModels(categorieEntities: List<ECategorie>): List<Categorie> {
        if (categorieEntities.isEmpty()) {
            return emptyList()
        }

        val categories = categorieEntities.stream()
                .map(this::fromEntityToModel)
                .filter(Optional<Categorie>::isPresent)
                .map(Optional<Categorie>::get)
                .collect(Collectors.toList())
        return categories
    }

    fun fromModelsToEntities(categories: List<Categorie>): List<ECategorie> {
        if (categories.isEmpty()) {
            return emptyList()
        }

        val categorieEntities = categories.stream()
                .map(this::fromModelToEntity)
                .filter(Optional<ECategorie>::isPresent)
                .map(Optional<ECategorie>::get)
                .collect(Collectors.toList())

        return categorieEntities;
    }
}