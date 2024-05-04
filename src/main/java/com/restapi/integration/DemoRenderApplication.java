package com.restapi.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoRenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRenderApplication.class, args);
	}
	
	@GetMapping
	public String messgae() {
		return "Successfully running spring boot app !";
	}

}
