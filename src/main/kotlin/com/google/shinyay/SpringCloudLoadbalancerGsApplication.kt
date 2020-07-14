package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class SpringCloudLoadbalancerGsApplication {

	@LoadBalanced
	@Bean
	fun template() = RestTemplate()
}

fun main(args: Array<String>) {
	runApplication<SpringCloudLoadbalancerGsApplication>(*args)
}

