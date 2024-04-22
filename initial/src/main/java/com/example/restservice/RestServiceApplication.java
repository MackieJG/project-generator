package com.example.restservice;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestServiceApplication {

	private final String[] business = { "a coffee roastery", "a pizza shop", "a animal shelter",
			"a street food vendor" };
	private final String[] concepts = { "landing page", "a nav menu", "a chatbot", "an order review screen" };

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);

	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/")
	public String getRandomItems() {
		Random random = new Random();

		return "{ \"business\": \"" + business[random.nextInt(business.length)] + "\", \"concept\": \""
				+ concepts[random.nextInt(concepts.length)]
				+ "\" }";
	}

}

// Achieved End Point
// Fetch from localhost:8080 and console.log
//
