package com.google.shinyay

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.client.WebClient

@SpringBootApplication
class SpringCloudLoadbalancerGsApplication {

	@LoadBalanced
	@Bean
	fun template() = RestTemplate()

	@LoadBalanced
	@Bean
	fun webClient() = WebClient.builder()
}

fun main(args: Array<String>) {
	runApplication<SpringCloudLoadbalancerGsApplication>(*args)
}

val Any.logger: Logger
	get() = LoggerFactory.getLogger(this.javaClass)
