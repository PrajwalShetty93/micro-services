package com.prajwal.client.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.prajwal.client.model.Person;

@RestController
@RequestMapping("/client")
public class ClientController {

	/*
	 * @Autowired WebClient webclient;
	 */

	/*
	 * @GetMapping("/hello")
	 * 
	 * @LoadBalanced public List<Person> hello() { WebClient.Builder builder =
	 * WebClient.builder(); List<Person> response =
	 * builder.build().get().uri("web-server/server/person").retrieve().bodyToMono(
	 * List.class).block(); return response; }
	 */
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	WebClient.Builder webClient;

	@GetMapping("/restTemplate")
	public List<Person> hello() {
		List<Person> response = restTemplate.getForEntity("http://web-server/server/person", List.class).getBody();
		return response;
	}

	@GetMapping("/webclient")
	public List<Person> web() {
		List<Person> response = webClient.build().get().uri("http://web-server/server/person").retrieve()
				.bodyToMono(List.class).block();
		return response;
	}
}
