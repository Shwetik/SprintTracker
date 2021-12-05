package com.axis.scrumgateway.config

import com.axis.scrumgateway.filter.JwtAuthenticationFilter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class SpringCloudConfig {
    @Autowired
    private val filter: JwtAuthenticationFilter? = null

    @Bean
    open fun routes(builder: RouteLocatorBuilder): RouteLocator? {
        return builder.routes().route("master") { r: PredicateSpec -> r.path("/master/**").filters { f: GatewayFilterSpec -> f.filter(filter) }.uri("http://localhost:8081/") }
                .route("team") { r: PredicateSpec -> r.path("/team/**").filters { f: GatewayFilterSpec -> f.filter(filter) }.uri("http://localhost:8082/") }
                .route("scrum-auth") { r: PredicateSpec -> r.path("/scrum-auth/**").filters { f: GatewayFilterSpec -> f.filter(filter) }.uri("http://localhost:8083/") }.build()
    }
//    @Bean
//    fun kotlinBasedRoutes(routeLocatorBuilder: RouteLocatorBuilder): RouteLocator =
//            routeLocatorBuilder.routes {
//                route {
//                    path("/parking/**")
//                    filters {
//                            filter
//                            stripPrefix(0)
//                    }
//                    uri("http://localhost:8081/")
//                }
//                route {
//                    path("/booking/**")
//                    filters {
//                            filter
//                             stripPrefix(0)
//                    }
//                    uri("http://localhost:8082/")
//                }
//            }
}