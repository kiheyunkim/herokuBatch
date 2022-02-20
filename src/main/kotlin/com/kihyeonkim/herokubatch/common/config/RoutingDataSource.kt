package com.kihyeonkim.herokubatch.common.config

import com.kihyeonkim.herokubatch.common.context.DatabaseContextHolder
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource


class RoutingDataSource : AbstractRoutingDataSource() {
	override fun determineCurrentLookupKey(): Any {
		return DatabaseContextHolder.getDataSourceType()
	}

}