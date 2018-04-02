package domainmodel.model.agence

import domainmodel.model.fournisseur.Fournisseur

data class Agence(
        var idAgence: Int,
        var telephone : String,
        var codeAgence : String,
        var adresse : String,
        var ville : String,
        var pays : String,
        var fournisseurs : List<Fournisseur>
){
    override fun toString(): String {
        return "Agence(idAgence=$idAgence, telephone='$telephone', codeAgence='$codeAgence', adresse='$adresse', ville='$ville', pays='$pays', fournisseurs=$fournisseurs)"
    }
}