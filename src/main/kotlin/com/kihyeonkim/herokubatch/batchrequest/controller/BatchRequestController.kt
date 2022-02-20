package com.kihyeonkim.herokubatch.batchrequest.controller

import com.kihyeonkim.herokubatch.common.model.BatchResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/batchRequest")
class BatchRequestController {
	@GetMapping("/refreshSkillTech")
	fun getRefreshSkillTech(): BatchResponse<*> {

		return BatchResponse.responseWithResponse(true)
	}
}