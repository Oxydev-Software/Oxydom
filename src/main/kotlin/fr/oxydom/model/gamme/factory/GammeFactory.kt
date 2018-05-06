package fr.oxydom.model.gamme.factory

import fr.oxydom.model.gamme.Gamme

interface GammeFactory {
    fun create(gamme : Gamme)
}