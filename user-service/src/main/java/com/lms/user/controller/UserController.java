package com.lms.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class UserController {
	
	@GetMapping("/ping")
	public String ping() {
		return "user-service is running..";
	}

}
