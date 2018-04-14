package domain.model.client

import application.impl.ClientCommand
import domain.model.projet.Projet

data class Client constructor(
        var idClient : Int,
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
    fun change(command : ClientCommand) {
        if (command.prenom != null){
            prenom = command.prenom
        }
        if (command.adresse != null){
            adresse = command.adresse
        }
        if (command.nom != null){
            nom = command.nom
        }
        if (command.civilite != null){
            civilite = command.civilite
        }
        if (command.pays != null){
            pays = command.pays
        }
        if(command.email != null){
            email = command.email
        }
        if(command.projets != null){
            projets = command.projets
        }

        if (command.photo != null){
            photo = command.photo
        }
        if (command.ville != null) {
            ville = command.ville
        }
    }
}