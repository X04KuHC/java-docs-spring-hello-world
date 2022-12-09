package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure! App with slash-long";
	}

	@RequestMapping("/{name}}")
	String sayHello2(@PathVariable("name") String name) {
		switch (name) {
			case "Oleg":
			return "Hello, Oleg! Nice to see you here!"
			case "Yaroslav":
			return "Hello, Master!"
			default:
			return "I do not recognise this name"
		}
		return "Default return in this function";
	}
}
