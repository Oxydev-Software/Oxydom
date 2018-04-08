package domain.model.maquette.factory

import dagger.Component
import domain.model.maquette.Maquette
@Component
interface MaquetteFactory {
    fun create(maquette: Maquette)
}