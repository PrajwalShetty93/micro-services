package com.prajwal.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


/*
 * Create a new Project called as discovery server and add Eureka server dependency in pom. Add @EnableEurekaService in the main method and port to 8671.
 * Now, add Eureka client dependencies in both the projects and @EnableEurekaClient in the main method.
 * Configure in the application properties as spring,application.name and that will get reflected in the eureka page.
 * Change the static url string content.
 * Also, if since we are using client level discovery we add @LoadBalanced in the Webclient Bean defined below. 
 * Read about Spring webflux  https://www.youtube.com/watch?v=M3jNn3HMeWg
 * */
@SpringBootApplication
@EnableEurekaClient
public class WebClientApplication {


	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean
	@LoadBalanced
	public WebClient.Builder getWebClientBuilder()
	{
		return WebClient.builder();
	}
}
