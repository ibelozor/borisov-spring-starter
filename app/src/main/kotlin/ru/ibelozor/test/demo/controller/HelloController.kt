package ru.ibelozor.test.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.ibelozor.test.demo.service.HelloService

@RestController
class HelloController {

    @Autowired
    lateinit var decisionService: HelloService

    @GetMapping("/")
    fun hello(@RequestParam q: String?): String {
        return if (decisionService.timeToBye(q)) "bye" else "hello!"
    }
}
