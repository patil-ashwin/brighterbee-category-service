package com.brighterbee.category.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/greeting")
@RefreshScope
@Slf4j
public class GreetingController {

	@Value("${app}")
	private String app;

	@GetMapping
	public String greet() {
		File file = new File(app + "secret.txt");
		try {
			boolean isFileCreated = file.createNewFile();
			if (isFileCreated) {
				try (FileWriter writter = new FileWriter(file)) {
					writter.write("Hello, It's secret!");
					writter.flush();
				}
			}
		} catch (IOException e) {
			log.error(e.getLocalizedMessage());
		}
		return "Hello, Good Evening ";
	}

}
