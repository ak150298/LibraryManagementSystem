package com.lms.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/user-service/**").uri("http://localhost:8081/user-service"))
				.route(p -> p.path("/book-service/**").uri("http://localhost:8082/book-service"))
				.route(p -> p.path("/subscription-service/**").uri("http://localhost:8083/subscription-service"))
				.build();
	}

}
