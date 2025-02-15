package com.example.demo;

import com.example.demo.cipher.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure! \nApp with slash-long";
	}

	@RequestMapping("/{name}")
	String sayHello2(@PathVariable("name") String name) {
		String result = "";
		switch (name) {
			case "Oleg":
			result = "Hello, Oleg! Nice to see you here!";
			break;
			case "Yaroslav":
			result = "Hello, Master!";
			break;
			default:
			result = "I do not recognise this name";
		}
		return result;
	}

	@RequestMapping(value = "/createUser", params = {"login", "password"})
	String createUser(@RequestParam("login") String login, @RequestParam("password") String password) {
		User user = new User(login, password);
		return "Login: " + user.getName() + " | UserID: " + user.getID();
	}
}
