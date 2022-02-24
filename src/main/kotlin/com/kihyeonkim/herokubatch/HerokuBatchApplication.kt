package com.kihyeonkim.herokubatch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
@EnableAspectJAutoProxy
class HerokuBatchApplication

fun main(args: Array<String>) {
	runApplication<HerokuBatchApplication>(*args)
}
