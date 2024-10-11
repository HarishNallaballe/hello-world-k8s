package com.gateway.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
	

	@GetMapping("welcome")
	public String welcomeMsg() {
		return "Good Morning";
	}

}
