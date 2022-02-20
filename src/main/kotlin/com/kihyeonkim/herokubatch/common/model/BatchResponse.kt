package com.kihyeonkim.herokubatch.common.model

data class BatchResponse<T> constructor(
	private val result: T?,
	private val errorMessage: String?,
	private val errorCode: String?
) {
	companion object {
		fun responseWithError(errorMessage: String, errorCode: String) = BatchResponse(null, errorMessage, errorCode)
		fun <T> responseWithResponse(result: T) = BatchResponse(result, null, null)
	}
}
