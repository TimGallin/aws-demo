package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class HelloController {
	@RequestMapping("/test")
	public String index() {
		log.info("123");
		return "Greetings from Spring Boot!";
	}

}