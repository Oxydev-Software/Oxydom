package domain.model.gamme.factory

import dagger.Component
import domain.model.gamme.Gamme
@Component
interface GammeFactory {
    fun create(gamme : Gamme)
}