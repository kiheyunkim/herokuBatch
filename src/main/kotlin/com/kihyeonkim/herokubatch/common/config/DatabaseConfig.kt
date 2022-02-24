package com.kihyeonkim.herokubatch.common.config

import com.kihyeonkim.herokubatch.common.datasource.DataSourceInterface
import com.kihyeonkim.herokubatch.common.datasource.TechTreeDataSource
import com.kihyeonkim.herokubatch.common.enumeration.DataSourceType
import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DatabaseConfig {
	@Autowired
	private lateinit var techTreeDataSource: TechTreeDataSource

	@Bean
	fun createRouterDatasource(): DataSource {
		val routingDataSource = RoutingDataSource()
		val dataSources = HashMap<Any, Any>()

		dataSources[DataSourceType.TECH_TREE] = getDatasourceInfo(techTreeDataSource)

		routingDataSource.setTargetDataSources(dataSources)
		routingDataSource.setDefaultTargetDataSource(getDatasourceInfo(techTreeDataSource))

		return routingDataSource
	}

	private fun getDatasourceInfo(dataSourceInterface: DataSourceInterface) =
		DataSourceBuilder.create()
			.type(HikariDataSource::class.java)
			.url(dataSourceInterface.url)
			.username(dataSourceInterface.username)
			.password(dataSourceInterface.password)
			.driverClassName(dataSourceInterface.driverClassName)
			.build()

}