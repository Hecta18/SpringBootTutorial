package com.example.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController annotation tells Spring that this code describes an endpoint that should be made available over the web.
@RestController
public class HelloController {
    //@GetMapping maps / to the index() method
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}