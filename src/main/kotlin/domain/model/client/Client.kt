package domain.model.client

import domain.model.projet.Projet

data class Client(
        var id: Int?,
        var prenom: String,
        var nom: String,
        var email: String,
        var adresse: String,
        var ville: String,
        var pays: String,
        var telephone: String,
        var photo: String,
        var civilite: String,
        var projets: List<Projet>
) {
    fun change(client: Client) {
        prenom = client.prenom
        adresse = client.adresse
        nom = client.nom
        civilite = client.civilite
        pays = client.pays
        email = client.email
        projets = client.projets
        photo = client.photo
        ville = client.ville
    }
}