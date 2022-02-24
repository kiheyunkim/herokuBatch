package com.kihyeonkim.herokubatch.batchrequest.service

import com.kihyeonkim.herokubatch.common.annotation.DataSource
import com.kihyeonkim.herokubatch.common.enumeration.DataSourceType
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class BatchRequestService {
	companion object {
		private val logger = LoggerFactory.getLogger(BatchRequestService::class.java)
	}

	@DataSource(dataSourceType = DataSourceType.TECH_TREE)
	fun requestTechTreeCrawling() {
		logger.info("ok")
	}
}