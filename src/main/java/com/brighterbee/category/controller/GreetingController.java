package com.brighterbee.category.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@GetMapping
	public String greet() {
		return "Hello, Good Evening";
	}

}