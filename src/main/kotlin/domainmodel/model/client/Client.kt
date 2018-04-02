package domainmodel.model.client

import domainmodel.model.projet.Projet

data class Client constructor(
        var idClient: Int,
        var prenom : String,
        var nom : String,
        var email : String,
        var adresse : String,
        var ville : String,
        var pays : String,
        var telephone : String,
        var photo : String,
        var civilite : String,
        var projets : List<Projet>
){
    override fun toString(): String {
        return "Client(idClient=$idClient, prenom='$prenom', nom='$nom', email='$email', adresse='$adresse', ville='$ville', pays='$pays', telephone='$telephone', photo='$photo', civilite='$civilite', projets=$projets)"
    }
}