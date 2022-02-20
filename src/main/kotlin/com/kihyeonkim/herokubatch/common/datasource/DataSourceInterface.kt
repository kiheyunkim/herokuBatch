package com.kihyeonkim.herokubatch.common.datasource

interface DataSourceInterface {
	val url: String
	val username: String
	val password: String
	val driverClassName: String
}
