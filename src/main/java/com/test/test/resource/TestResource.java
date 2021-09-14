package com.test.test.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {
	
	@GetMapping("/home")
	public String getMessage() {
		
		return "Hello World";
		
	}

}
