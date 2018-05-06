import fr.oxydom.portadapter.persistence.entity.EClient
import fr.oxydom.portadapter.persistence.mapper.ClientMapper
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.testng.Assert
import org.testng.annotations.Test
import java.util.*


@RunWith(SpringRunner::class)
class ClientMapperIntegrationTest : AbstractTestNGSpringContextTests() {

    @Autowired
    lateinit var clientMapper: ClientMapper

    @Test
    fun retrieveById(){
        val idClient = 1
        val client = clientMapper.retrieveById(idClient)

        assertEntity(client)

    }

    private fun assertEntity(client: Optional<EClient>) {
        Assert.assertTrue(client.isPresent )
        Assert.assertEquals(client.get().nom , "jean")
    }
}

