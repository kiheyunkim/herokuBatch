package com.kihyeonkim.herokubatch.common.datasource

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component


@Component
@ConfigurationProperties(prefix = "tech-tree")
data class TechTreeDataSource(
	override var url: String = "",
	override var username: String = "",
	override var password: String = "",
	override var driverClassName: String = ""
) : DataSourceInterface
