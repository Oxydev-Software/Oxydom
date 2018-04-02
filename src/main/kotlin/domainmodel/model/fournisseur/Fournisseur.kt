package domainmodel.model.fournisseur

import domainmodel.model.agence.Agence

data class Fournisseur(
        var idFournisseur: Int,
        var numeroSiret: String,
        var nom: String,
        var adresse: String,
        var ville: String,
        var pays: String,
        var email: String,
        var telephone: String,
        var agence: List<Agence>
) {
    override fun toString(): String {
        return "Fournisseur(idFournisseur=$idFournisseur, numeroSiret='$numeroSiret', nom='$nom', adresse='$adresse', ville='$ville', pays='$pays', email='$email', telephone='$telephone', agence=$agence)"
    }
}