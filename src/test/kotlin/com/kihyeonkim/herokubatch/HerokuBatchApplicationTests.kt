package com.kihyeonkim.herokubatch

import com.kihyeonkim.herokubatch.batchrequest.service.BatchRequestService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class HerokuBatchApplicationTests {

	@Autowired
	private lateinit var batchRequestService: BatchRequestService

	@Test
	fun contextLoads() {
		batchRequestService.requestTechTreeCrawling()
	}

}
