package com.brighterbee.category.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	@Value("${app}")
	private String app;

	@GetMapping
	public String greet() {
		return "Hello, Good Evening " + app;
	}

}
