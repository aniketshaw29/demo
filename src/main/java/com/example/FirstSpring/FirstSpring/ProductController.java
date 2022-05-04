package com.example.FirstSpring.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/aniket")
	public String sayHello() {
		return "Hello Aniket Shaw!!!";
	}
	
}
