package com.example.EurekaServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import kotlin.jvm.JvmStatic
import org.springframework.boot.SpringApplication

@SpringBootApplication
@EnableEurekaServer
open class EurekaServerApplication
{
companion object {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(EurekaServerApplication::class.java, *args)
    }
}
}