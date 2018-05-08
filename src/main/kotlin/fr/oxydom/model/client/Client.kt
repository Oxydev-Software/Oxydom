package fr.oxydom.model.client

data class Client(
        var id: Int?,
        var prenom: String,
        var nom: String,
        var email: String,
        var adresse: String,
        var ville: String,
        var pays: String,
        var telephone: String,
        var photo: String?,
        var civilite: String
) {
    fun change(client: Client) {
        prenom = client.prenom
        adresse = client.adresse
        nom = client.nom
        civilite = client.civilite
        pays = client.pays
        email = client.email
        photo = client.photo
        ville = client.ville
    }
}