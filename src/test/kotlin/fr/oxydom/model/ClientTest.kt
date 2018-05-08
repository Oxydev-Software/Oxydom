package fr.oxydom.model

import fr.oxydom.model.client.Client
import org.testng.Assert
import org.testng.annotations.Test

class ClientTest {
    val client : Client = Client(
            null,
            "jean",
            "Claudius",
            "jeanclaudius@gmail.com",
            "12 quai jaures",
            "Toulouse",
            "France",
            "0609915465",
            null,
            "fr")
    @Test
    fun clientCreation(){
        val clientCreated = client

        Assert.assertNotNull(clientCreated)
        Assert.assertEquals(clientCreated.nom, "Claudius")
    }

    @Test
    fun change(){
        val client = client
        val clientToChangeWith = Client(
                2,
                "jacques",
                "Claudius",
                "jeanclaudius@gmail.com",
                "12 quai jaures",
                "Toulouse",
                "France",
                "0609915465",
                null,
                "fr")

        client.change(clientToChangeWith)
        Assert.assertEquals(client.prenom, clientToChangeWith.prenom)
    }
}