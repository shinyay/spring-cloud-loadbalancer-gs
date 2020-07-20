package com.google.shinyay.controller

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class CallController(val template: RestTemplate,
                     val environment: Environment) {
}