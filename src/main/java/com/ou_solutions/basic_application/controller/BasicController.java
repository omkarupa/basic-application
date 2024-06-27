package com.ou_solutions.basic_application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> getWelcomeMessage()
	{
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<String> getUserName()
	{
		return new ResponseEntity<String>("Adminuser", HttpStatus.OK);
	}


}
