package com.google.shinyay.controller

import com.google.shinyay.logger
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class CallController(val template: RestTemplate,
                     val environment: Environment) {

    fun call(): String {
        val url = "http://callme-service/callme"
        val callmeResponse = template.getForObject(url, String::class.java)
        logger.info("Response: $callmeResponse")
        return "Port: ${environment.getProperty("local.server.port")} calling -> $callmeResponse"
    }
}