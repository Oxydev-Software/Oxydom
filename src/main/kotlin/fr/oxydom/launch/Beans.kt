package fr.oxydom.launch

import com.zaxxer.hikari.HikariDataSource
import org.mybatis.spring.SqlSessionFactoryBean
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans
import org.springframework.jdbc.datasource.DataSourceTransactionManager

val context: GenericApplicationContext = GenericApplicationContext()

fun beans() = beans {
    bean<HikariDataSource>()
    bean("DataSourceTransactionManager"){
        val transactionManager = DataSourceTransactionManager()
        transactionManager.dataSource = ref<HikariDataSource>()
    }
    bean("SqlSessionFactoryBean") {
        val sqlSessionFactoryBean = SqlSessionFactoryBean()
        sqlSessionFactoryBean.setDataSource(ref<HikariDataSource>())
        sqlSessionFactoryBean.setConfigLocation(context.getResource("classpath:fr/oxydom/portadapter/persistence/mybatis-config.xml"))
        val resultMaps = context.getResource("classpath:fr/oxydom/portadapter/persistence/resultmap/*.xml")
        sqlSessionFactoryBean.setMapperLocations(arrayOf(resultMaps))
    }
}
class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) =
            beans().initialize(context)
}