package com.kihyeonkim.herokubatch.common.datasource

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component


@Component
@ConfigurationProperties(prefix = "tech-tree.datasource")
data class TechTreeDataSource(
	override val url: String = "",
	override val username: String = "",
	override val password: String = "",
	override val driverClassName: String = ""
) : DataSourceInterface
