package portadapter.persistence.entity

data class EModule(
        var idModule: Int,
        var libelleModule: String,
        var prix: Float,
        var longueur: Float,
        var largeur: Float,
        var epaisseur: Float,
        var commentaire: String,
        var ecategorie: ECategorie,
        var valide: Boolean,
        var egamme: EGamme) {
}