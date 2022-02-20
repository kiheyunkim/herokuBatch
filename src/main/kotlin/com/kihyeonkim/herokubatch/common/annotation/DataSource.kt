package com.kihyeonkim.herokubatch.common.annotation

import com.kihyeonkim.herokubatch.common.enumeration.DataSourceType

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class DataSource(
	val dataSourceType: DataSourceType
)