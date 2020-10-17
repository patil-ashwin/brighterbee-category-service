package com.brighterbee.category;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class BrighterbeeCategoryServiceApplication {

	public static void main(String[] args) {
		System.out.println(args);
		Stream.of(args).forEach(a -> log.info(a));
		SpringApplication.run(BrighterbeeCategoryServiceApplication.class, args);
	}
}
