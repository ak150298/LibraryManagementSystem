package com.lms.subscription.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.subscription.entity.Subscription;
import com.lms.subscription.repository.SubscriptionRepository;

@RestController
@RequestMapping("subscription-service")
public class SubscriptionController {
	
	@Autowired
	SubscriptionRepository subRepo;
	
	@GetMapping("/ping")
	public String ping() {
		return "subscription-service is running..";
	}
	
	@PostMapping("/subscribebook")
	public String subscribeBook(@RequestBody Subscription subscription) {
		subRepo.save(subscription);
		subscription.getBook().setCount(String.valueOf(Integer.parseInt(subscription.getBook().getCount())-1));
		return "book subscribed";
	}
	
	@PutMapping("/renewbook")
	public String renewBook(@RequestBody Subscription subscription) {
		subRepo.save(subscription);
		return "book renewed";
	}
	
	@PostMapping("/returnBook")
	public String returnBook(@RequestBody Subscription subscription) {
		subRepo.save(subscription);
		subscription.getBook().setCount(String.valueOf(Integer.parseInt(subscription.getBook().getCount())+1));
		return "book returned";
	}

}
