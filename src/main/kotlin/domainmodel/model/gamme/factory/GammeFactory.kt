package domainmodel.model.gamme.factory

import domainmodel.model.gamme.Gamme

interface GammeFactory {
    fun create(gamme : Gamme)
}