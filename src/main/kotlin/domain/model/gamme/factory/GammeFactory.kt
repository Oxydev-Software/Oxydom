package domain.model.gamme.factory

import domain.model.gamme.Gamme

interface GammeFactory {
    fun create(gamme : Gamme)
}