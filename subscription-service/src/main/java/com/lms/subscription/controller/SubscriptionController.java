package com.lms.subscription.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("subscription-service")
public class SubscriptionController {
	
	@GetMapping("/ping")
	public String ping() {
		return "subscription-service is running..";
	}

}
