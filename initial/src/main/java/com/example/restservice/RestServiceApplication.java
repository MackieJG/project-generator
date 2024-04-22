package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@GetMapping("/business")
	public Map<Integer, String> getBusiness() {
		Map<Integer, String> response = new HashMap<>();
		response.put(0, "a coffee roastery");
		response.put(1, "a pizza shop");
		response.put(2, "a animal shelter");
		response.put(3, "a homeless shelter");
		response.put(4, "a music store");
		response.put(5, "a street food vendor");
		response.put(6, "a community magazine");
		response.put(7, "Iron Man");
		response.put(8, "a brewery");
		response.put(9, "a tour guide company");
		return response;
	}

	@GetMapping("/concept")
	public Map<Integer, String> getConcept() {
		Map<Integer, String> response = new HashMap<>();
		response.put(0, "landing page");
		response.put(1, "discord bot");
		response.put(2, "a set of button components");
		response.put(3, "a nav menu");
		response.put(4, "a scheduling app");
		response.put(5, "an order review screen");
		response.put(6, "a web UI kit");
		response.put(7, "an automated tool");
		response.put(8, "a chatbot");
		response.put(9, "a translation tool");
		return response;
	}

}
