package ru.ibelozor.test.demo.service

import org.springframework.stereotype.Service

@Service
class HelloServiceImpl : HelloService {
    override fun timeToBye(query: String?): Boolean {
        return query != null
    }
}
