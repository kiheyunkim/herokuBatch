package com.kihyeonkim.herokubatch.common.aop

import com.kihyeonkim.herokubatch.common.annotation.DataSource
import com.kihyeonkim.herokubatch.common.context.DatabaseContextHolder
import com.kihyeonkim.herokubatch.common.enumeration.DataSourceType
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.reflect.MethodSignature
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Aspect
@Component
@Order(value = 1)
class DataSourceAspect {

	companion object {
		val logger: Logger = LoggerFactory.getLogger(DataSourceAspect::class.java)
	}

	@Around("@annotation(com.kihyeonkim.herokubatch.common.annotation.DataSource)")
	fun processDataSource(proceedingJointPoint: ProceedingJoinPoint): Any? {
		logger.debug("Datasource Annotation Around Start")

		val methodSignature = proceedingJointPoint.signature as MethodSignature
		val method = methodSignature.method

		val dataSource = method.getAnnotation(DataSource::class.java)

		if (dataSource != null) {
			DatabaseContextHolder.setDataSourceType(dataSource.dataSourceType)
		} else {
			//Default DataSource
			DatabaseContextHolder.setDataSourceType(DataSourceType.TECH_TREE2)
		}


		logger.debug("DatasourceType ===> ${DatabaseContextHolder.getDataSourceType()}")

		val returnValue = proceedingJointPoint.proceed()
		DatabaseContextHolder.clearDataSourceType()

		logger.debug("Datasource Annotation Around End")

		return returnValue
	}

}