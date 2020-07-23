package com.google.shinyay.controller

import com.google.shinyay.logger
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class CallController(val template: RestTemplate,
                     val environment: Environment) {

    @GetMapping("/myapp")
    fun call(): String {
        val url = "http://config-client/myapp"
        val response = template.getForObject(url, String::class.java)
        logger.info("Response: $response")
        return "Port: ${environment.getProperty("local.server.port")} calling -> $response"
    }
}