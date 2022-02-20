package com.kihyeonkim.herokubatch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HerokuBatchApplication

fun main(args: Array<String>) {
	runApplication<HerokuBatchApplication>(*args)
}
