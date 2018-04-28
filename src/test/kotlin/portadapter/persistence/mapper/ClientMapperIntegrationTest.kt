//import org.junit.runner.RunWith
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.test.context.junit4.SpringRunner
//import org.testng.Assert
//import org.testng.annotations.Test
//import portadapter.persistence.entity.EClient
//import portadapter.persistence.mapper.ClientMapper
//import java.util.*
//
//
//@RunWith(SpringRunner::class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class ClientMapperIntegrationTest {
//
//    @Autowired
//    lateinit var clientMapper : ClientMapper
//
//    @Test
//    fun retrieveById(){
//        val idClient = 1
//       val client = clientMapper.retrieveById(idClient)
//
//        assertEntity(client)
//
//    }
//
//    private fun assertEntity(client: Optional<EClient>) {
//        Assert.assertTrue(client.isPresent )
//        Assert.assertEquals(client.get().nom , "jean")
//    }
//}
//
//