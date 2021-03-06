package com.Microservice.apigateway;

//import java.util.function.Function;

//import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.Buildable;
//import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * So what we are doing in here is creating a simple route function.

If a request comes to /get, then we would want to redirect it to this specific

URI.
 */

@Configuration
public class APIGatewayConfiguration {
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes().route(p -> p.path("/get")
				.filters(f -> f.addRequestHeader("MyHeader", "MyURI").addRequestParameter("Param", "MyValue"))
				.uri("http://httpbin.org:80"))
				.route(p->p.path("/currency-exchange/**")
				/*.uri("lb://currency-exchange"))*/
				.uri("lb://CURRENCY-EXCHANGE"))
				.route(p->p.path("/currency-conversion/**")
				/*.uri("lb://currency-conversion"))*/
				.uri("lb://CURRENCY-CONVERSION"))
				.route(p->p.path("/currency-conversion-feign/**")
				/*.uri("lb://currency-conversion"))*/
				.uri("lb://CURRENCY-CONVERSION"))
				.route(p->p.path("/currency-conversion-new/**")
				.filters(f->f.rewritePath(
				"/currency-conversion-new/(?<segment>.*)", 
				"/currency-conversion-feign/${segment}"))		
				/*.uri("lb://currency-conversion"))*/
				.uri("lb://CURRENCY-CONVERSION"))
				.build();
	}
}
