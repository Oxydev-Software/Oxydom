package domain.model.modele.factory

import dagger.Component
import domain.model.modele.Modele
@Component
interface ModeleFactory {
    fun create(modele : Modele)
}