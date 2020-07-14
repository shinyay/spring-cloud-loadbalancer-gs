package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudLoadbalancerGsApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudLoadbalancerGsApplication>(*args)
}
